/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.integrador;

import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Freddy
 */
public class integral_claro extends javax.swing.JFrame {

    public integral_claro() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono_proyecto_integrador.png")));
        Txt_Polinomio_Opcion_2.setVisible(false);
        Txt_Exponente_Opcion_2.setVisible(false);
        Txt_Denominador_Opcion_3.setVisible(false);
        Txt_Exponente_Denominador.setVisible(false);
        Lbl_Linea_Fraccion_Opcion_3.setVisible(false);
        Lbl_Integral.setVisible(false);
        Lbl_Diferencial_Opcion_1_3.setVisible(true);
        Lbl_Diferencial_Opcion_2.setVisible(false);
        Txt_Polinomio_Opcion_1_2_3.setVisible(false);
        Lbl_Exponente_Opcion_1_2_3.setVisible(false);
        Lbl_Diferencial_Opcion_1_3.setVisible(false);
        Lbl_peticion_usuario.setVisible(false);
        Btn_Siguiente_Proceso.setVisible(true);
        Lbl_Simbolo_Integracion.setVisible(false);
        Txt_Polinomio_Opcion_1_2_3.setText("");
        Lbl_Exponente_Opcion_1_2_3.setText("");
        Txt_Denominador_Opcion_3.setText("");
        Txt_Exponente_Denominador.setText("");
        Txt_Polinomio_Opcion_2.setText("");
        Txt_Exponente_Opcion_2.setText("");
        Lbl_Exponente_Denominador1.setText("");
        Lbl_Denominador_U1.setText("");
        Lbl_Linea_Division_Variable_Sustitucion.setText("");
        Lbl_Linea_Division_Integral.setText("");
        Lbl_Denominador_U.setText("");
        Lbl_Variable_Sustitucion_U.setText("");
        Lbl_Denominador_Resultado_Derivada.setText("");
        Lbl_Variable.setText("");
        Lbl_Linea_Constante.setText("");
        Lbl_Denominador_Constante.setText("");
        Lbl_Constante.setText("");
        Lbl_Linea_Fraccion2.setText("");
        Lbl_Numerador_X.setText("");
        Lbl_Exponente_Denominador.setText("");
        Lbl_Exponente_Numerador.setText("");
        Lbl_Constante_Integracion.setText("");
        Btn_Siguiente_Proceso.setVisible(false);

    }
    int xMouse, yMouse;
    String seleccion;
    String opciones;
    int copciones = 0;
    String variablederivar;
    String funcion;
    String respuestaderivada;
    String variable1;
    int exponente1;
    int divisor1;
    int i = 1;
    String respuestaderivadacomprimido;
    String superior;
    int exponente2;
    String Respuesta_Final_Entero_Opcion_1 = "";
    String Respuesta_Final_Entero_Opcion_3 = "";
    String Guardar_Numero_A_Entero_Opcion_3 = "";
    int Validacion_Trigonometrica = 0;
    int exponente2_validacion_entera = 0;
    String exponente_raiz = "";

    public void Calcular_Derivada() {
        Lbl_Variable_Sustitucion_U.setVisible(true);
        Lbl_Variable.setVisible(true);
        Lbl_Denominador_U.setVisible(false);
        Lbl_Linea_Division_Integral.setVisible(false);
        Lbl_Denominador_U1.setText("");
        Lbl_Exponente_Numerador.setText("");
        Lbl_Variable.setText("");
        Lbl_Variable_Sustitucion_U.setText("");
        Lbl_Denominador_U.setText("");
        Lbl_Denominador_Resultado_Derivada.setText("");
        Lbl_Linea_Division_Variable_Sustitucion.setText("");
        Lbl_Constante.setText("");
        Lbl_Denominador_Constante.setText("");
        Lbl_Linea_Constante.setText("");
        switch (seleccion) {
            case "∫(___)dx":

                if ("".equals(Txt_Polinomio_Opcion_1_2_3.getText().trim()) || "".equals(Lbl_Exponente_Opcion_1_2_3.getText().trim())) {

                    JOptionPane.showMessageDialog(null, "Completar los campos ", "Error", JOptionPane.ERROR_MESSAGE);
                    Btn_Siguiente_Proceso.setVisible(false);
                } else {
                    Panel_Resultados.add(Lbl_Simbolo_Integracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
                    Btn_Siguiente_Proceso.setVisible(true);
                    String variablederivar_trigonometrica = Txt_Polinomio_Opcion_1_2_3.getText().substring(0, 3);
                    String validacion_entero_trigonometrica;
                    String[] split5 = Txt_Polinomio_Opcion_1_2_3.getText().split("s");
                    String Caracteres_Separados_5 = split5[0];

                    System.out.println(split5[0] + "este de aqui pal chuel ");
                    if (split5.length > 1) {
                        if ("".equals(split5[0])) {
                            superior = "1";
                        } else {
                            superior = split5[0];
                        }

                        variablederivar_trigonometrica = "sin";
                    }
                    String[] split6 = Txt_Polinomio_Opcion_1_2_3.getText().split("cos");
                    String Caracteres_Separados_6 = split6[0];
                    System.out.println(split6[0] + "este de aqui pal chuel 2 ");
                    if (split6.length > 1) {

                        if ("".equals(split6[0])) {
                            superior = "1";
                        } else {
                            superior = split6[0];
                        }
                        variablederivar_trigonometrica = "cos";
                    }

                    String[] split_evalidar = Txt_Polinomio_Opcion_1_2_3.getText().split("e");
                    String Caracteres_Separados_evalidar = split_evalidar[0];
                    System.out.println(split_evalidar[0]);
                    if (split_evalidar.length > 1) {

                        if ("".equals(split_evalidar[0])) {
                            superior = "1";
                        } else {
                            superior = split_evalidar[0];
                        }
                        variablederivar_trigonometrica = "e";
                    }

                    switch (variablederivar_trigonometrica) {
                        case "sin":
                            Validacion_Trigonometrica = 1;
                            Lbl_Variable_Sustitucion_U.setText("u= ");
                            String[] split = Txt_Polinomio_Opcion_1_2_3.getText().split("\\(");
                            String Caracteres_Separados_1 = split[1];
                            split[1] = split[1].substring(0, Caracteres_Separados_1.length() - 1);
                            for (int i = 0; i < split.length; i++) {
                                System.out.println(split[i]);
                            }
                            Lbl_Variable.setText(split[1]);
                            String Interior_Parentesis = split[1];
                            funcion = Interior_Parentesis;

                            respuestaderivada = "";
                            exponente1 = Integer.parseInt(Lbl_Exponente_Opcion_1_2_3.getText());

                            if (!funcion.isEmpty()) {
                                Derivadas derivada = new Derivadas();
                                derivada.setFuncionADerivar(funcion);
                                derivada.derivar();
                                respuestaderivada = derivada.getFuncionDerivada();
                                System.out.println(String.valueOf(respuestaderivada));
                                String[] split4 = respuestaderivada.split("\\.");
                                String Caracteres_Separados_8 = split4[0];

                                String Polinomio_Derivado = String.valueOf(Caracteres_Separados_8);
                                System.out.println(Polinomio_Derivado);
                                char[] cadena_div = Polinomio_Derivado.toCharArray();
                                String Guardar_Numero_Derivado_A_Entero = Polinomio_Derivado;
                                for (int a = 0; a < cadena_div.length; a++) {

                                }

                                System.out.println(Guardar_Numero_Derivado_A_Entero + "desde aqui no vale");

                                System.out.println(Guardar_Numero_Derivado_A_Entero);

                                if ("-".equals(respuestaderivada.substring(0, 1))) {
                                    Respuesta_Final_Entero_Opcion_1 = "-" + Guardar_Numero_Derivado_A_Entero.trim();
                                } else {
                                    Respuesta_Final_Entero_Opcion_1 = Guardar_Numero_Derivado_A_Entero.trim();
                                }
                                System.out.println(Respuesta_Final_Entero_Opcion_1 + "" + "xdxdxdxd");

                            } else {
                                JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            Lbl_Variable.setText(split[1]);

                            i = 1;
                            break;
                        case "cos":
                            Validacion_Trigonometrica = 2;
                            Lbl_Variable_Sustitucion_U.setText("u= ");
                            String[] split2 = Txt_Polinomio_Opcion_1_2_3.getText().split("\\(");
                            String Caracteres_Separados_2 = split2[1];
                            split2[1] = split2[1].substring(0, Caracteres_Separados_2.length() - 1);
                            for (int i = 0; i < split2.length; i++) {
                                System.out.println(split2[i]);
                            }
                            Lbl_Variable.setText(split2[1]);
                            String Interior_Parentesis2 = split2[1];
                            funcion = Interior_Parentesis2;

                            respuestaderivada = "";
                            exponente1 = Integer.parseInt(Lbl_Exponente_Opcion_1_2_3.getText());

                            if (!funcion.isEmpty()) {
                                Derivadas derivada = new Derivadas();
                                derivada.setFuncionADerivar(funcion);
                                derivada.derivar();
                                respuestaderivada = derivada.getFuncionDerivada();
                                System.out.println(String.valueOf(respuestaderivada));
                                String[] split4 = respuestaderivada.split("\\.");
                                String Caracteres_Separados_8 = split4[0];

                                String Polinomio_Derivado = String.valueOf(Caracteres_Separados_8);
                                System.out.println(Polinomio_Derivado);
                                char[] cadena_div = Polinomio_Derivado.toCharArray();
                                String Guardar_Numero_Derivado_A_Entero = "";
                                for (int a = 0; a < cadena_div.length; a++) {
                                    if (Character.isDigit(cadena_div[a])) {
                                        Guardar_Numero_Derivado_A_Entero += cadena_div[a];
                                    }
                                }

                                System.out.println(Guardar_Numero_Derivado_A_Entero);

                                System.out.println(Guardar_Numero_Derivado_A_Entero);
                                Respuesta_Final_Entero_Opcion_1 = Guardar_Numero_Derivado_A_Entero;

                                System.out.println(Respuesta_Final_Entero_Opcion_1 + "" + "xdxdxdxd");

                            } else {
                                JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            Lbl_Variable.setText(split2[1]);

                            i = 1;
                            break;
                        case "e":
                            Validacion_Trigonometrica = 4;
                            Lbl_Variable_Sustitucion_U.setText("u= ");
                            String[] split_e = Txt_Polinomio_Opcion_1_2_3.getText().split("\\^");
                            String Caracteres_Separados_e = split_e[1];
                            for (int i = 0; i < split_e.length; i++) {
                                System.out.println(split_e[i] + "este de aqui mi perro ");
                            }
                            Lbl_Variable.setText(split_e[1]);
                            String Interior_Parentesis_e = split_e[1];
                            funcion = Interior_Parentesis_e;

                            respuestaderivada = "";
                            exponente1 = Integer.parseInt(Lbl_Exponente_Opcion_1_2_3.getText());

                            if (!funcion.isEmpty()) {
                                Derivadas derivada = new Derivadas();
                                derivada.setFuncionADerivar(funcion);
                                derivada.derivar();
                                respuestaderivada = derivada.getFuncionDerivada();
                                System.out.println(String.valueOf(respuestaderivada));
                                String[] split4 = respuestaderivada.split("\\.");
                                String Caracteres_Separados_8 = split4[0];

                                String Polinomio_Derivado = String.valueOf(Caracteres_Separados_8);
                                System.out.println(Polinomio_Derivado);
                                char[] cadena_div = Polinomio_Derivado.toCharArray();
                                String Guardar_Numero_Derivado_A_Entero = Polinomio_Derivado;
                                for (int a = 0; a < cadena_div.length; a++) {

                                }

                                System.out.println(Guardar_Numero_Derivado_A_Entero + "desde aqui no vale");

                                System.out.println(Guardar_Numero_Derivado_A_Entero);

                                if ("-".equals(respuestaderivada.substring(0, 1))) {
                                    Respuesta_Final_Entero_Opcion_1 = "-" + Guardar_Numero_Derivado_A_Entero.trim();
                                } else {
                                    Respuesta_Final_Entero_Opcion_1 = Guardar_Numero_Derivado_A_Entero.trim();
                                }
                                System.out.println(Respuesta_Final_Entero_Opcion_1 + "" + "xdxdxdxd");

                            } else {
                                JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            Lbl_Variable.setText(split_e[1]);

                            i = 1;
                            break;
                        default:
                            Lbl_Variable_Sustitucion_U.setText("u= ");
                            variablederivar = Txt_Polinomio_Opcion_1_2_3.getText().trim();

                            funcion = variablederivar;

                            respuestaderivada = "";
                            exponente1 = Integer.parseInt(Lbl_Exponente_Opcion_1_2_3.getText());

                            if (!funcion.isEmpty()) {
                                Derivadas derivada = new Derivadas();
                                derivada.setFuncionADerivar(funcion);
                                derivada.derivar();
                                respuestaderivada = derivada.getFuncionDerivada();
                                System.out.println(String.valueOf(respuestaderivada));

                                String Polinomio_Derivado = String.valueOf(respuestaderivada);
                                System.out.println(Polinomio_Derivado + "este de aqui ");
                                String[] split3 = Polinomio_Derivado.split("\\.");
                                String Caracteres_Separados_3 = split3[0];

                                for (int i = 0; i < split3.length; i++) {
                                    System.out.println(split3[i]);
                                }
                                Lbl_Variable.setText(split3[0]);
                                Respuesta_Final_Entero_Opcion_1 = Caracteres_Separados_3;

                                System.out.println(Respuesta_Final_Entero_Opcion_1 + "" + "xdxdxdxd");

                            } else {
                                JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            Lbl_Variable.setText(variablederivar);

                            i = 1;
                            break;
                    }
                }
                break;

            case "∫(___) / (___)dx":
                if ("".equals(Txt_Polinomio_Opcion_1_2_3.getText().trim()) || "".equals(Lbl_Exponente_Opcion_1_2_3.getText().trim())
                        || "".equals(Txt_Denominador_Opcion_3.getText().trim()) || "".equals(Txt_Exponente_Denominador.getText().trim())) {

                    JOptionPane.showMessageDialog(null, "Completar los campos ", "Error", JOptionPane.ERROR_MESSAGE);
                    Btn_Siguiente_Proceso.setVisible(false);
                } else {
                    Panel_Resultados.add(Lbl_Simbolo_Integracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
                    Btn_Siguiente_Proceso.setVisible(true);
                    int validasencos_polinomio_superior = 10;
                    int validasencos_polinomio_Inferior = 0;

                    String[] split9 = Txt_Denominador_Opcion_3.getText().split("s");
                    String Caracteres_Separados_9 = split9[0];

                    System.out.println(split9[0] + "este de aqui pal chuel ");
                    if (split9.length > 1) {
                        validasencos_polinomio_Inferior = 1;
                    }
                    String[] split10 = Txt_Denominador_Opcion_3.getText().split("c");
                    String Caracteres_Separados_10 = split10[0];
                    System.out.println(split10[0] + "este de aqui pal chuel 2 ");

                    Lbl_Variable_Sustitucion_U.setText("u=");

                    variablederivar = Txt_Denominador_Opcion_3.getText().trim();

                    if (variablederivar.contains("sqrt")) {
                        String[] split_derivada_raiz = variablederivar.split("\\(");
                        variablederivar = split_derivada_raiz[1];
                        variablederivar = variablederivar.substring(0, variablederivar.length() - 1);
                        exponente_raiz = "1/2";
                    }

                    superior = Txt_Polinomio_Opcion_1_2_3.getText();
                    funcion = variablederivar;
                    respuestaderivada = "";
                    exponente1 = Integer.parseInt(Lbl_Exponente_Opcion_1_2_3.getText());
                    exponente2 = Integer.parseInt(Txt_Exponente_Denominador.getText());
                    Lbl_Variable.setText(variablederivar);
                    if (variablederivar.contains("e")) {
                        String[] split_e = variablederivar.split("\\(");
                        variablederivar = split_e[1];
                        variablederivar = variablederivar.substring(0, (variablederivar.length() - 1));
                        Lbl_Variable.setText("-" + variablederivar);
                    }
                    funcion = variablederivar;
                    if (!funcion.isEmpty()) {
                        Derivadas derivada = new Derivadas();
                        derivada.setFuncionADerivar(funcion);
                        derivada.derivar();
                        respuestaderivada = derivada.getFuncionDerivada();
                        if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                            respuestaderivada = "-" + respuestaderivada;
                        }
                        System.out.println(String.valueOf(respuestaderivada + "que de aqui no pase "));
                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {

                        }

                        String[] split4 = respuestaderivada.split("\\.");
                        String Caracteres_Separados_4 = split4[0];
                        if (respuestaderivada.contains("-")) {
                            Caracteres_Separados_4 = "-" + Caracteres_Separados_4;
                        }

                        for (int i = 0; i < split4.length; i++) {
                            System.out.println(split4[i]);
                        }

                        Respuesta_Final_Entero_Opcion_1 = Caracteres_Separados_4;
                        if (variablederivar.contains("e")) {
                            Respuesta_Final_Entero_Opcion_1 = "-" + Respuesta_Final_Entero_Opcion_1;
                        }
                        System.out.println(Respuesta_Final_Entero_Opcion_1 + "" + "xdxdxdxd");
                        String cadena2 = Txt_Polinomio_Opcion_1_2_3.getText();
                        if ("x".equals(cadena2)) {
                            cadena2 = "1";
                        } else {
                            if (cadena2.length() == 1) {

                            } else {
                                cadena2 = cadena2.substring(0, cadena2.length() - 1);
                            }

                        }
                        String comparacion = cadena2;

                        System.out.println(cadena2);
                        char[] cadena2_div = cadena2.toCharArray();
                        String Numerador_Opcion_1_2_3 = "";
                        for (int a = 0; a < cadena2_div.length; a++) {
                            if (Character.isDigit(cadena2_div[a])) {
                                Numerador_Opcion_1_2_3 += cadena2_div[a];
                            }
                        }
                        System.out.println(Numerador_Opcion_1_2_3);
                        System.out.println(Numerador_Opcion_1_2_3);

                        if (Txt_Polinomio_Opcion_1_2_3.getText().contains("sin")
                                || Txt_Polinomio_Opcion_1_2_3.getText().contains("cos")) {
                            if (Txt_Polinomio_Opcion_1_2_3.getText().contains("sin")) {
                                String[] split_Separacion_trigonometrica_sin = Txt_Polinomio_Opcion_1_2_3.getText().split("sin");
                                Respuesta_Final_Entero_Opcion_3 = split_Separacion_trigonometrica_sin[0];

                            }
                            if (Txt_Polinomio_Opcion_1_2_3.getText().contains("cos")) {
                                String[] split_Separacion_trigonometrica_cos = Txt_Polinomio_Opcion_1_2_3.getText().split("cos");
                                Respuesta_Final_Entero_Opcion_3 = split_Separacion_trigonometrica_cos[0];

                            }

                        } else {
                            if (Txt_Polinomio_Opcion_1_2_3.getText().length() > 1) {
                                String[] splitcadena = Txt_Polinomio_Opcion_1_2_3.getText().split("x");
                                Numerador_Opcion_1_2_3 = splitcadena[0];
                                Respuesta_Final_Entero_Opcion_3 = Numerador_Opcion_1_2_3;
                            }
                        }

                        System.out.println(Respuesta_Final_Entero_Opcion_3 + "este mi perrott");

                    } else {
                        JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                    Lbl_Exponente_Denominador.setText(String.valueOf(""));
                    i = 1;
                }
                break;

            case "∫(___)(___)dx":
                if ("".equals(Txt_Polinomio_Opcion_1_2_3.getText().trim()) || "".equals(Lbl_Exponente_Opcion_1_2_3.getText().trim()) || "".equals(Txt_Polinomio_Opcion_2.getText().trim()) || "".equals(Txt_Exponente_Opcion_2.getText().trim())) {

                    JOptionPane.showMessageDialog(null, "Completar los campos ", "Error", JOptionPane.ERROR_MESSAGE);
                    Btn_Siguiente_Proceso.setVisible(false);
                } else {
                    int validasencos_polinomio_superior = 10;
                    int validasencos_polinomio_Inferior = 0;
                    superior = Txt_Polinomio_Opcion_1_2_3.getText();
                    Btn_Siguiente_Proceso.setVisible(true);
                    Lbl_Variable_Sustitucion_U.setText("u=");
                    variablederivar = Txt_Polinomio_Opcion_2.getText().trim();
                    Lbl_Variable.setText(variablederivar);
                    if (variablederivar.contains("e")) {
                        String[] split_e = variablederivar.split("\\(");
                        variablederivar = split_e[1];
                        variablederivar = variablederivar.substring(0, (variablederivar.length() - 1));
                        Lbl_Variable.setText(variablederivar);

                    }

                    String[] split7 = Txt_Polinomio_Opcion_1_2_3.getText().split("s");
                    String Caracteres_Separados_7 = split7[0];

                    System.out.println(split7[0] + "este de aqui pal chuel ");
                    if (split7.length > 1) {
                        validasencos_polinomio_superior = 1;
                    }
                    String[] split8 = Txt_Polinomio_Opcion_1_2_3.getText().split("c");
                    String Caracteres_Separados_8 = split8[0];
                    System.out.println(split8[0] + "este de aqui pal chuel 2 ");
                    if (split8.length > 1) {
                        validasencos_polinomio_superior = 2;

                    }
                    String[] split9 = Txt_Denominador_Opcion_3.getText().split("s");
                    String Caracteres_Separados_9 = split9[0];

                    System.out.println(split9[0] + "este de aqui pal chuel ");
                    if (split9.length > 1) {
                        validasencos_polinomio_Inferior = 1;
                    }
                    String[] split10 = Txt_Denominador_Opcion_3.getText().split("c");
                    String Caracteres_Separados_10 = split10[0];
                    System.out.println(split10[0] + "este de aqui pal chuel 2 ");
                    if (split8.length > 1) {

                        validasencos_polinomio_Inferior = 2;
                    }

                    funcion = variablederivar;
                    respuestaderivada = "";
                    exponente1 = Integer.parseInt(Lbl_Exponente_Opcion_1_2_3.getText());
                    exponente2 = Integer.parseInt(Txt_Exponente_Opcion_2.getText());

                    if (!funcion.isEmpty()) {
                        Derivadas derivada = new Derivadas();
                        derivada.setFuncionADerivar(funcion);
                        derivada.derivar();
                        respuestaderivada = derivada.getFuncionDerivada();
                        System.out.println(String.valueOf(respuestaderivada));

                        String[] split4 = respuestaderivada.split("\\.");
                        String Caracteres_Separados_4 = split4[0];
                        if (respuestaderivada.contains("-")) {
                            Caracteres_Separados_4 = "-" + Caracteres_Separados_4;
                        }
                        Respuesta_Final_Entero_Opcion_1 = Caracteres_Separados_4;

                        //Lbl_Variable.setText(split4[0]);
                        System.out.println(Respuesta_Final_Entero_Opcion_1 + "" + "xdxdxdxd");
                        String cadena2 = Txt_Polinomio_Opcion_1_2_3.getText();
                        if (cadena2.length() == 1) {

                        } else {
                            cadena2 = cadena2.substring(0, cadena2.length() - 1);
                        }

                        String comparacion = cadena2;

                        System.out.println(cadena2);
                        char[] cadena2_div = cadena2.toCharArray();
                        String Numerador_Opcion_1_2_3 = "";
                        for (int a = 0; a < cadena2_div.length; a++) {
                            if (Character.isDigit(cadena2_div[a])) {
                                Numerador_Opcion_1_2_3 += cadena2_div[a];
                            }
                        }
                        System.out.println(Numerador_Opcion_1_2_3);
                        Numerador_Opcion_1_2_3 = Numerador_Opcion_1_2_3.replace("0", " ");
                        System.out.println(Numerador_Opcion_1_2_3);

                        if (Txt_Polinomio_Opcion_1_2_3.getText().contains("sin")
                                || Txt_Polinomio_Opcion_1_2_3.getText().contains("cos")) {

                            if (Txt_Polinomio_Opcion_1_2_3.getText().contains("sin")) {
                                String[] split_Separacion_trigonometrica_sin = Txt_Polinomio_Opcion_1_2_3.getText().split("sin");
                                Respuesta_Final_Entero_Opcion_3 = split_Separacion_trigonometrica_sin[0];

                            }
                            if (Txt_Polinomio_Opcion_1_2_3.getText().contains("cos")) {
                                String[] split_Separacion_trigonometrica_cos = Txt_Polinomio_Opcion_1_2_3.getText().split("cos");
                                Respuesta_Final_Entero_Opcion_3 = split_Separacion_trigonometrica_cos[0];

                            }
                        } else {
                            String[] splitcadena = Txt_Polinomio_Opcion_1_2_3.getText().split("x");
                            Numerador_Opcion_1_2_3 = splitcadena[0];
                            if (Numerador_Opcion_1_2_3.contains("/")) {
                                String[] split_slash_multiplicacion = Numerador_Opcion_1_2_3.split("/");
                                Numerador_Opcion_1_2_3 = split_slash_multiplicacion[0];
                            }
                            Respuesta_Final_Entero_Opcion_3 = Numerador_Opcion_1_2_3;
                        }

                        System.out.println(Respuesta_Final_Entero_Opcion_3 + "");

                    } else {
                        JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                    Lbl_Exponente_Denominador.setText(String.valueOf(""));
                    i = 1;
                }
                break;
        }
    }

    public void SeleccionOperaciones() {
        seleccion = Combo_Box_Operaciones.getSelectedItem().toString();

        switch (seleccion) {
            case "∫(___)dx":
                Lbl_peticion_usuario.setVisible(false);
                Btn_Siguiente_Proceso.setVisible(true);
                Txt_Polinomio_Opcion_1_2_3.setText("");
                Lbl_Exponente_Opcion_1_2_3.setText("");
                Txt_Denominador_Opcion_3.setText("");
                Txt_Exponente_Denominador.setText("");
                Txt_Polinomio_Opcion_2.setText("");
                Txt_Exponente_Opcion_2.setText("");
                Lbl_Exponente_Denominador1.setText("");
                Lbl_Denominador_U1.setText("");
                Lbl_Linea_Division_Variable_Sustitucion.setText("");
                Lbl_Linea_Division_Integral.setText("");
                Lbl_Denominador_U.setText("");
                Lbl_Variable_Sustitucion_U.setText("");
                Lbl_Denominador_Resultado_Derivada.setText("");
                Lbl_Variable.setText("");
                Lbl_Linea_Constante.setText("");
                Lbl_Denominador_Constante.setText("");
                Lbl_Constante.setText("");
                Lbl_Linea_Fraccion2.setText("");
                Lbl_Numerador_X.setText("");
                Lbl_Exponente_Denominador.setText("");
                Lbl_Exponente_Numerador.setText("");
                Lbl_Constante_Integracion.setText("");
                copciones = 1;
                Txt_Polinomio_Opcion_1_2_3.setVisible(true);
                Lbl_Exponente_Opcion_1_2_3.setVisible(true);
                Txt_Polinomio_Opcion_2.setVisible(false);
                Txt_Exponente_Opcion_2.setVisible(false);
                Txt_Denominador_Opcion_3.setVisible(false);
                Txt_Exponente_Denominador.setVisible(false);
                Lbl_Integral.setVisible(true);
                Lbl_Linea_Fraccion_Opcion_3.setVisible(false);
                Lbl_Diferencial_Opcion_1_3.setVisible(true);
                Lbl_Diferencial_Opcion_2.setVisible(false);
                break;
            case "∫(___)(___)dx":
                Btn_Siguiente_Proceso.setVisible(true);
                Txt_Polinomio_Opcion_1_2_3.setText("");
                Lbl_Exponente_Opcion_1_2_3.setText("");
                Txt_Denominador_Opcion_3.setText("");
                Txt_Exponente_Denominador.setText("");
                Txt_Polinomio_Opcion_2.setText("");
                Txt_Exponente_Opcion_2.setText("");
                Lbl_Exponente_Denominador1.setText("");
                Lbl_Denominador_U1.setText("");
                Lbl_Linea_Division_Variable_Sustitucion.setText("");
                Lbl_Linea_Division_Integral.setText("");
                Lbl_Denominador_U.setText("");
                Lbl_Variable_Sustitucion_U.setText("");
                Lbl_Denominador_Resultado_Derivada.setText("");
                Lbl_Variable.setText("");
                Lbl_Linea_Constante.setText("");
                Lbl_Denominador_Constante.setText("");
                Lbl_Constante.setText("");
                Lbl_Linea_Fraccion2.setText("");
                Lbl_Numerador_X.setText("");
                Lbl_Exponente_Denominador.setText("");
                Lbl_Exponente_Numerador.setText("");
                Lbl_Constante_Integracion.setText("");
                copciones = 2;
                Txt_Polinomio_Opcion_1_2_3.setVisible(true);
                Lbl_Exponente_Opcion_1_2_3.setVisible(true);
                Txt_Polinomio_Opcion_2.setVisible(true);
                Txt_Exponente_Opcion_2.setVisible(true);
                Lbl_Diferencial_Opcion_1_3.setVisible(false);
                Lbl_Integral.setVisible(true);
                Txt_Exponente_Denominador.setVisible(false);
                Txt_Denominador_Opcion_3.setVisible(false);
                Lbl_Diferencial_Opcion_2.setVisible(true);
                Lbl_peticion_usuario.setVisible(true);
                Lbl_Linea_Fraccion_Opcion_3.setVisible(false);
                break;
            case "∫(___) / (___)dx":
                Lbl_peticion_usuario.setVisible(false);
                Btn_Siguiente_Proceso.setVisible(true);
                Txt_Polinomio_Opcion_1_2_3.setText("");
                Lbl_Exponente_Opcion_1_2_3.setText("");
                Txt_Denominador_Opcion_3.setText("");
                Txt_Exponente_Denominador.setText("");
                Txt_Polinomio_Opcion_2.setText("");
                Txt_Exponente_Opcion_2.setText("");
                Lbl_Exponente_Denominador1.setText("");
                Lbl_Denominador_U1.setText("");
                Lbl_Linea_Division_Variable_Sustitucion.setText("");
                Lbl_Linea_Division_Integral.setText("");
                Lbl_Denominador_U.setText("");
                Lbl_Variable_Sustitucion_U.setText("");
                Lbl_Denominador_Resultado_Derivada.setText("");
                Lbl_Variable.setText("");
                Lbl_Linea_Constante.setText("");
                Lbl_Denominador_Constante.setText("");
                Lbl_Constante.setText("");
                Lbl_Linea_Fraccion2.setText("");
                Lbl_Numerador_X.setText("");
                Lbl_Exponente_Denominador.setText("");
                Lbl_Exponente_Numerador.setText("");
                Lbl_Constante_Integracion.setText("");
                copciones = 3;
                Txt_Polinomio_Opcion_1_2_3.setVisible(true);
                Lbl_Exponente_Opcion_1_2_3.setVisible(true);
                Txt_Denominador_Opcion_3.setVisible(true);
                Txt_Exponente_Denominador.setVisible(true);
                Lbl_Linea_Fraccion_Opcion_3.setVisible(true);
                Lbl_Integral.setVisible(true);
                Txt_Exponente_Opcion_2.setVisible(false);
                Txt_Denominador_Opcion_3.setVisible(true);
                Lbl_Diferencial_Opcion_1_3.setVisible(true);
                Txt_Polinomio_Opcion_2.setVisible(false);
                Txt_Exponente_Opcion_2.setVisible(false);
                Lbl_Diferencial_Opcion_2.setVisible(false);
                break;
        }
    }

    public void Resultados() {
        String Numero_Pasos_Resultados = String.valueOf(i);
        if ("-".equals(respuestaderivada.substring(0, 1))) {
            respuestaderivadacomprimido = respuestaderivada.substring((respuestaderivada.length() - 4), (respuestaderivada.length() - 2));
        } else {
            respuestaderivadacomprimido = respuestaderivada.substring(0, 1);
        }
        switch (seleccion) {
            case "∫(___)dx":
                if ("".equals(Txt_Polinomio_Opcion_1_2_3.getText()) || "".equals(Lbl_Exponente_Opcion_1_2_3.getText())) {
                    Btn_Siguiente_Proceso.setVisible(false);
                } else {
                    switch (String.valueOf(Validacion_Trigonometrica)) {
                        case "1":
                            switch (Numero_Pasos_Resultados) {
                                case "1":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);

                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Variable_Sustitucion_U.setText("du");
                                    Lbl_Variable.setText("dx");
                                    Lbl_Denominador_U.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("________  =");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "2":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Simbolo_Integracion.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "sin(u)");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("______");
                                    i = i + 1;
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "3":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);

                                    Lbl_Variable_Sustitucion_U.setText("sin(u)");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText("");

                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText(superior);
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "4":
                                    Lbl_Simbolo_Integracion.setVisible(false);
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("sin(u)");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    if ((Integer.parseInt(superior)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) == 0) {
                                        superior = String.valueOf(Integer.parseInt(superior) / Integer.parseInt(Respuesta_Final_Entero_Opcion_1));
                                        Respuesta_Final_Entero_Opcion_1 = "1";
                                    } else if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) % (Integer.parseInt(superior)) == 0) {
                                        Respuesta_Final_Entero_Opcion_1 = String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_1) / Integer.parseInt(superior));
                                        superior = "1";
                                    }
                                    Lbl_Constante.setText(superior);
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("_______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "5":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "sin(u)");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "6":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "(-cos(" + funcion + "))");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    Btn_Siguiente_Proceso.setVisible(false);
                                    break;

                            }
                            break;
                        case "2":
                            switch (Numero_Pasos_Resultados) {
                                case "1":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);

                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Variable_Sustitucion_U.setText("du");
                                    Lbl_Variable.setText("dx");
                                    Lbl_Denominador_U.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("________  =");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "2":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Simbolo_Integracion.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "cos(u)");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("______");
                                    i = i + 1;
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "3":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("cos(u)");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText("");

                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText(superior);
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "4":
                                    Lbl_Simbolo_Integracion.setVisible(false);
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("cos(u)");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    if ((Integer.parseInt(superior)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) == 0) {
                                        superior = String.valueOf(Integer.parseInt(superior) / Integer.parseInt(Respuesta_Final_Entero_Opcion_1));
                                        Respuesta_Final_Entero_Opcion_1 = "1";
                                    } else if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) % (Integer.parseInt(superior)) == 0) {
                                        Respuesta_Final_Entero_Opcion_1 = String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_1) / Integer.parseInt(superior));
                                        superior = "1";
                                    }
                                    Lbl_Constante.setText(superior);
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("_______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "5":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "cos(u)");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "6":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "(sin(" + funcion + "))");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                                    i = i + 1;
                                    Btn_Siguiente_Proceso.setVisible(false);
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;

                            }
                            break;
                        case "4":
                            switch (Numero_Pasos_Resultados) {
                                case "1":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);

                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Variable_Sustitucion_U.setText("du");
                                    Lbl_Variable.setText("dx");
                                    Lbl_Denominador_U.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("________  =");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "2":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Simbolo_Integracion.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "e^u");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("______");
                                    i = i + 1;
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "3":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("e^u");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText("");

                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText(superior);
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "4":
                                    Lbl_Simbolo_Integracion.setVisible(false);
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("e^u");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    if ((Integer.parseInt(superior)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) == 0) {
                                        superior = String.valueOf(Integer.parseInt(superior) / Integer.parseInt(Respuesta_Final_Entero_Opcion_1));
                                        Respuesta_Final_Entero_Opcion_1 = "1";
                                    } else if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) % (Integer.parseInt(superior)) == 0) {
                                        Respuesta_Final_Entero_Opcion_1 = String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_1) / Integer.parseInt(superior));
                                        superior = "1";
                                    }
                                    Lbl_Constante.setText(superior);
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("_______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "5":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "e^u");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "6":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText(superior + "e^" + funcion);

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                                    i = i + 1;
                                    Btn_Siguiente_Proceso.setVisible(false);
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;

                            }
                            break;

                        default:
                            switch (Numero_Pasos_Resultados) {
                                case "1":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);

                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Variable_Sustitucion_U.setText("du");
                                    Lbl_Variable.setText("dx");
                                    Lbl_Denominador_U.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("________  =");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "2":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Simbolo_Integracion.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("u");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("______");
                                    i = i + 1;
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "3":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("u");
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("du");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_Resultado_Derivada.setText("");

                                    Lbl_Linea_Division_Integral.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("1");
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "4":
                                    Lbl_Simbolo_Integracion.setVisible(false);
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("u");
                                    exponente1 = exponente1 + 1;
                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("1");
                                    Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                                    Lbl_Linea_Constante.setText("_______");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "5":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("u");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    i = i + 1;
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                                case "6":
                                    Lbl_Variable_Sustitucion_U.setVisible(true);
                                    Lbl_Variable.setVisible(true);
                                    Lbl_Denominador_U.setVisible(true);
                                    Lbl_Linea_Division_Integral.setVisible(true);
                                    Lbl_Variable_Sustitucion_U.setText("(" + funcion + ")");

                                    Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                                    Lbl_Variable.setText("");

                                    Lbl_Denominador_U.setText("");
                                    Lbl_Denominador_U.setText(String.valueOf(exponente1 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                                    Lbl_Linea_Division_Integral.setText("__________");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("");
                                    Lbl_Constante.setText("");
                                    Lbl_Denominador_Constante.setText("");
                                    Lbl_Linea_Constante.setText("");
                                    Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                                    i = i + 1;
                                    Btn_Siguiente_Proceso.setVisible(false);
                                    Numero_Pasos_Resultados = String.valueOf(i);
                                    break;
                            }
                    }

                    break;
                }
            case "∫(___) / (___)dx":

                switch (Numero_Pasos_Resultados) {
                    case "1":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Integral.setVisible(true);
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        Lbl_Variable_Sustitucion_U.setText("du");
                        Lbl_Variable.setText("dx");
                        Lbl_Denominador_U.setText(respuestaderivada);
                        Lbl_Linea_Division_Integral.setText("________  =");
                        Lbl_Constante.setText("");
                        Lbl_Denominador_Constante.setText("");
                        Lbl_Linea_Constante.setText("");
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "2":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Simbolo_Integracion.setVisible(true);
                        Lbl_Variable_Sustitucion_U.setText(superior);
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                        Lbl_Variable.setText("du");

                        Lbl_Denominador_U.setText("u");
                        if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                            Lbl_Denominador_U.setText("e^u");
                        }
                        Lbl_Denominador_Resultado_Derivada.setText(respuestaderivada);
                        Lbl_Linea_Division_Integral.setText("_____________");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("_______");
                        Lbl_Exponente_Denominador.setText(String.valueOf(exponente2));
                        i = i + 1;
                        Lbl_Constante.setText("");
                        Lbl_Denominador_Constante.setText("");
                        Lbl_Linea_Constante.setText("");
                        Numero_Pasos_Resultados = String.valueOf(i);
                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {
                            Lbl_Exponente_Denominador.setText("1/2");
                        }
                        break;
                    case "3":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Variable_Sustitucion_U.setText("1");
                        Lbl_Exponente_Numerador.setText("");
                        Lbl_Variable.setText("du");
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                        Lbl_Denominador_U.setText("u");
                        if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                            Lbl_Denominador_U.setText("e^u");
                        }
                        Lbl_Denominador_Resultado_Derivada.setText("");

                        Lbl_Linea_Division_Integral.setText("____________");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");

                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {

                            Lbl_Exponente_Denominador.setText("1/2");

                        }
                        if ("-".equals(Respuesta_Final_Entero_Opcion_3)) {

                            Respuesta_Final_Entero_Opcion_3 = "-1";

                            System.out.println(Respuesta_Final_Entero_Opcion_3 + "este de aqui no se esta haciendo bien ");
                        }
                        if ("".equals(Respuesta_Final_Entero_Opcion_3)) {

                            Respuesta_Final_Entero_Opcion_3 = "1";

                            System.out.println(Respuesta_Final_Entero_Opcion_3 + "este de aqui no se esta haciendo bien ");
                        }
                        if ("sin(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "1";
                        }
                        if ("-sin(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "-1";

                        }
                        if ("cos(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "1";
                        }
                        if ("-cos(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "-1";
                        }
                        Lbl_Constante.setText(Respuesta_Final_Entero_Opcion_3);
                        Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                        Lbl_Linea_Constante.setText("________");

                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {
                            Lbl_Exponente_Denominador.setText("1/2");
                        }
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "4":
                        Lbl_Simbolo_Integracion.setVisible(false);
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");
                        if (exponente2 == 1) {
                        } else {
                            exponente2 = exponente2 - 1;
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                exponente2 = exponente2 + 1;
                            }
                        }

                        Lbl_Exponente_Numerador.setText("");
                        Lbl_Variable.setText("");
                        Lbl_Variable_Sustitucion_U.setText("1");
                        Lbl_Exponente_Denominador.setText(String.valueOf(exponente2));
                        String exponente2_validacion = String.valueOf(exponente2);
                        exponente2_validacion_entera = exponente2;
                        if (exponente2_validacion.contains("-")) {
                            exponente2_validacion_entera = exponente2_validacion_entera * -1;
                            Lbl_Denominador_U.setText("(" + exponente2_validacion_entera + ")" + "u");
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                Lbl_Denominador_U.setText("(" + exponente2_validacion_entera + ")" + "e^u");
                            }
                        } else {
                            Lbl_Denominador_U.setText("(" + exponente2_validacion_entera + ")" + "u");
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                Lbl_Denominador_U.setText("(" + exponente2_validacion_entera + ")" + "e^u");
                            }
                        }
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));

                        Lbl_Linea_Division_Integral.setText("__________");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) == 0) {
                            Respuesta_Final_Entero_Opcion_3 = String.valueOf((Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) / (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));
                            Respuesta_Final_Entero_Opcion_1 = "1";
                        } else if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) == 0) {
                            Respuesta_Final_Entero_Opcion_1 = String.valueOf((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) / (Integer.parseInt(Respuesta_Final_Entero_Opcion_3)));
                            Respuesta_Final_Entero_Opcion_3 = "1";
                        }

                        Lbl_Constante.setText(Respuesta_Final_Entero_Opcion_3);

                        Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                        Lbl_Linea_Constante.setText("________");

                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {
                            Lbl_Exponente_Denominador.setText("1/2");
                            Lbl_Denominador_U.setText("(" + exponente_raiz + ")" + "u");
                        }

                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "5":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");

                        Lbl_Exponente_Numerador.setText(String.valueOf(""));
                        Lbl_Variable.setText("");
                        Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3);
                        Lbl_Denominador_U.setText("");
                        Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "u");
                        if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                            Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "e^u");
                        }
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                        Lbl_Linea_Division_Integral.setText("__________");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        Lbl_Constante.setText("");
                        Lbl_Denominador_Constante.setText("");
                        Lbl_Linea_Constante.setText("");
                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {
                            Lbl_Exponente_Denominador.setText("1/2");
                            Lbl_Denominador_U.setText("(" + exponente_raiz + ")" + "u");
                        }
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "6":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");

                        Lbl_Variable.setText("");
                        if ("-cos(x)".equals(funcion)) {
                            funcion = "cos(x)";
                        }
                        if ("-sin(x)".equals(funcion)) {
                            funcion = "sin(x)";
                        }
                        if (exponente2_validacion_entera == 1) {
                            Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3 + "ln|" + funcion + "|");
                            Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "e^(" + funcion + ")");
                                Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3);
                            }
                            Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                            Lbl_Linea_Division_Integral.setText("__________");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("");
                            Lbl_Constante.setText("");
                            Lbl_Denominador_Constante.setText("");
                            Lbl_Linea_Constante.setText("");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("+C");

                        } else {
                            Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3);
                            Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "(" + funcion + ")");
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "e^(" + funcion + ")");
                            }
                            Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                            Lbl_Linea_Division_Integral.setText("__________");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("");
                            Lbl_Constante.setText("");
                            Lbl_Denominador_Constante.setText("");
                            Lbl_Linea_Constante.setText("");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                        }
                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {
                            Lbl_Exponente_Denominador.setText("1/2");
                            Lbl_Denominador_U.setText("(" + exponente_raiz + ")" + funcion);
                            Lbl_Variable_Sustitucion_U.setText("1");
                        }

                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "7":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                        Lbl_Exponente_Numerador.setText(String.valueOf(""));
                        Lbl_Variable.setText("");
                        if (exponente2_validacion_entera == 1) {
                            if (Integer.parseInt(Respuesta_Final_Entero_Opcion_3) % exponente2_validacion_entera == 0) {
                                Respuesta_Final_Entero_Opcion_3 = String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_3) / exponente2_validacion_entera);
                                exponente2_validacion_entera = 1;
                            } else {

                                if (exponente2_validacion_entera % Integer.parseInt(Respuesta_Final_Entero_Opcion_3) == 0) {
                                    exponente2_validacion_entera = exponente2_validacion_entera / Integer.parseInt(Respuesta_Final_Entero_Opcion_3);
                                    Respuesta_Final_Entero_Opcion_3 = "1";
                                }
                            }
                            Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3 + "ln|" + funcion + "|");
                            Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "e^(" + funcion + ")");
                                Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3);
                            }
                            Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                            Lbl_Linea_Division_Integral.setText("__________");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("");
                            Lbl_Constante.setText("");
                            Lbl_Denominador_Constante.setText("");
                            Lbl_Linea_Constante.setText("");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                        } else {
                            if (Integer.parseInt(Respuesta_Final_Entero_Opcion_3) % exponente2_validacion_entera == 0) {
                                Respuesta_Final_Entero_Opcion_3 = String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_3) / exponente2);
                                exponente2_validacion_entera = 1;
                            } else {

                                if (exponente2_validacion_entera % Integer.parseInt(Respuesta_Final_Entero_Opcion_3) == 0) {
                                    exponente2_validacion_entera = exponente2_validacion_entera / Integer.parseInt(Respuesta_Final_Entero_Opcion_3);
                                    Respuesta_Final_Entero_Opcion_3 = "1";
                                }
                            }
                            Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3);
                            Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "(" + funcion + ")");
                            if (Txt_Denominador_Opcion_3.getText().contains("e")) {
                                Lbl_Denominador_U.setText(String.valueOf(exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) + "e^(" + funcion + ")");
                            }
                            Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                            Lbl_Linea_Division_Integral.setText("__________");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("");
                            Lbl_Constante.setText("");
                            Lbl_Denominador_Constante.setText("");
                            Lbl_Linea_Constante.setText("");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                        }
                        if (Txt_Denominador_Opcion_3.getText().contains("sqrt")) {
                            Lbl_Exponente_Denominador.setText("1");
                            Lbl_Exponente_Numerador.setText("1/2");
                            Lbl_Variable_Sustitucion_U.setText("(" + "2" + ")" + "(" + funcion + ")");
                        }

                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "8":
                        String validacion_exponente_negarito = String.valueOf(exponente2);

                        if (validacion_exponente_negarito.contains("-")) {
                            Lbl_Linea_Division_Integral.setText("");
                            Lbl_Variable_Sustitucion_U.setText("(" + funcion + ")");
                            int complemento_validacion = exponente2_validacion_entera * Integer.parseInt(Respuesta_Final_Entero_Opcion_1);
                            Lbl_Denominador_U.setText(String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_3) * complemento_validacion));
                            exponente1 = exponente1 * -1;
                            exponente2 = exponente2 * -1;
                            Lbl_Exponente_Numerador.setText(String.valueOf(exponente2));
                            Lbl_Exponente_Denominador.setText(String.valueOf(exponente1));
                            Lbl_Linea_Division_Integral.setText("__________");
                        }
                        Btn_Siguiente_Proceso.setVisible(false);
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;

                }
                break;
            case "∫(___)(___)dx":
                switch (Numero_Pasos_Resultados) {
                    case "1":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Integral.setVisible(true);
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        Lbl_Variable_Sustitucion_U.setText("du");
                        Lbl_Variable.setText("dx");
                        Lbl_Denominador_U.setText(respuestaderivada);
                        Lbl_Linea_Division_Integral.setText("________  =");
                        Lbl_Constante.setText("");
                        Lbl_Denominador_Constante.setText("");
                        Lbl_Linea_Constante.setText("");
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "2":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U1.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Panel_Resultados.add(Lbl_Simbolo_Integracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
                        Lbl_Simbolo_Integracion.setVisible(true);

                        Lbl_Variable_Sustitucion_U.setText(superior);
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente1));
                        Lbl_Variable.setText("du");
                        Lbl_Denominador_U.setText("");
                        Lbl_Denominador_U1.setText("u");
                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            Lbl_Denominador_U1.setText("e^u");
                        }
                        Lbl_Denominador_Resultado_Derivada.setText(respuestaderivada);
                        Lbl_Linea_Division_Integral.setText("");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("________");
                        Lbl_Exponente_Denominador1.setText(String.valueOf(exponente2));
                        i = i + 1;
                        Lbl_Constante.setText("");
                        Lbl_Denominador_Constante.setText("");
                        Lbl_Linea_Constante.setText("");
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "3":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Variable_Sustitucion_U.setText("1");
                        Lbl_Exponente_Numerador.setText("");
                        Lbl_Variable.setText("du");
                        Lbl_Denominador_U1.setText("u");
                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            Lbl_Denominador_U1.setText("e^u");
                        }

                        Lbl_Denominador_Resultado_Derivada.setText("");

                        Lbl_Linea_Division_Integral.setText("");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        if ("-".equals(Respuesta_Final_Entero_Opcion_3)) {

                            Respuesta_Final_Entero_Opcion_3 = "-1";

                            System.out.println(Respuesta_Final_Entero_Opcion_3 + "este de aqui no se esta haciendo bien ");
                        }
                        if ("".equals(Respuesta_Final_Entero_Opcion_3)) {

                            Respuesta_Final_Entero_Opcion_3 = "1";

                            System.out.println(Respuesta_Final_Entero_Opcion_3 + "este de aqui no se esta haciendo bien ");
                        }
                        if ("sin(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "1";
                        }
                        if ("-sin(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "-1";

                        }
                        if ("cos(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "1";
                        }
                        if ("-cos(x)".equals(Respuesta_Final_Entero_Opcion_1)) {
                            Respuesta_Final_Entero_Opcion_1 = "-1";
                        }
                        Lbl_Constante.setText(Respuesta_Final_Entero_Opcion_3);
                        Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                        Lbl_Linea_Constante.setText("________");
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "4":
                        Lbl_Simbolo_Integracion.setVisible(false);
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U1.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");

                        exponente2 = exponente2 + 1;
                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            exponente2 = exponente2 - 1;
                        }
                        Lbl_Exponente_Numerador.setText(String.valueOf(exponente2));
                        Lbl_Variable.setText("");
                        Lbl_Variable_Sustitucion_U.setText("u");
                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            Lbl_Variable_Sustitucion_U.setText("e^u");
                        }
                        Lbl_Exponente_Denominador1.setText("");

                        Lbl_Denominador_U.setText("(" + exponente2 + ")");

                        Lbl_Linea_Division_Integral.setText("__________");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) == 0) {
                            Respuesta_Final_Entero_Opcion_3 = String.valueOf((Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) / (Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));
                            Respuesta_Final_Entero_Opcion_1 = "1";
                        } else if ((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) % (Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) == 0) {
                            Respuesta_Final_Entero_Opcion_1 = String.valueOf((Integer.parseInt(Respuesta_Final_Entero_Opcion_1)) / (Integer.parseInt(Respuesta_Final_Entero_Opcion_3)));
                            Respuesta_Final_Entero_Opcion_3 = "1";
                        }

                        Lbl_Constante.setText(Respuesta_Final_Entero_Opcion_3);

                        Lbl_Denominador_Constante.setText(Respuesta_Final_Entero_Opcion_1);
                        Lbl_Linea_Constante.setText("________");
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "5":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U1.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");

                        Lbl_Variable.setText("");
                        Lbl_Variable_Sustitucion_U.setText(String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) + "(u)");
                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            Lbl_Variable_Sustitucion_U.setText(String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_3)) + "(e^u)");
                        }
                        Lbl_Denominador_U.setText(String.valueOf(String.valueOf(exponente2 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1))));
                        Lbl_Denominador_U1.setText("");

                        Lbl_Linea_Division_Integral.setText("__________");
                        Lbl_Linea_Division_Variable_Sustitucion.setText("");
                        Lbl_Constante.setText("");
                        Lbl_Denominador_Constante.setText("");
                        Lbl_Linea_Constante.setText("");
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "6":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");

                        if ("-cos(x)".equals(funcion)) {
                            funcion = "cos(x)";
                        }
                        if ("-sin(x)".equals(funcion)) {
                            funcion = "sin(x)";
                        }
                        Lbl_Variable.setText("");
                        if (exponente2 == 1) {

                        } else {

                            Lbl_Denominador_U.setText(String.valueOf(exponente2 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1)));

                            Lbl_Linea_Division_Integral.setText("__________");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("");
                            Lbl_Constante.setText("");
                            Lbl_Denominador_Constante.setText("");
                            Lbl_Linea_Constante.setText("");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                        }
                        Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3 + "(" + funcion + ")");

                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3 + "e^(" + funcion + ")");

                        }
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;
                    case "7":
                        Lbl_Variable_Sustitucion_U.setVisible(true);
                        Lbl_Variable.setVisible(true);
                        Lbl_Denominador_U.setVisible(true);
                        Lbl_Linea_Division_Integral.setVisible(true);
                        Lbl_Denominador_U1.setText("");

                        Lbl_Variable.setText("");
                        if (exponente2 == 1) {

                        } else {
                            if (Integer.parseInt(Respuesta_Final_Entero_Opcion_3) % exponente2 == 0) {
                                Respuesta_Final_Entero_Opcion_3 = String.valueOf(Integer.parseInt(Respuesta_Final_Entero_Opcion_3) / exponente2);
                                exponente2 = 1;
                            } else {

                                if (exponente2 % Integer.parseInt(Respuesta_Final_Entero_Opcion_3) == 0) {
                                    exponente2 = exponente2 / Integer.parseInt(Respuesta_Final_Entero_Opcion_3);
                                    Respuesta_Final_Entero_Opcion_3 = "1";
                                }
                            }

                            Lbl_Denominador_U.setText(String.valueOf(String.valueOf(exponente2 * Integer.parseInt(Respuesta_Final_Entero_Opcion_1))));

                            Lbl_Linea_Division_Integral.setText("__________");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("");
                            Lbl_Constante.setText("");
                            Lbl_Denominador_Constante.setText("");
                            Lbl_Linea_Constante.setText("");
                            Lbl_Linea_Division_Variable_Sustitucion.setText("+C");
                        }
                        Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3 + "(" + funcion + ")");

                        if (Txt_Polinomio_Opcion_2.getText().contains("e")) {
                            Lbl_Variable_Sustitucion_U.setText(Respuesta_Final_Entero_Opcion_3 + "e^(" + funcion + ")");

                        }
                        Btn_Siguiente_Proceso.setVisible(false);
                        i = i + 1;
                        Numero_Pasos_Resultados = String.valueOf(i);
                        break;

                }
                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fondo = new javax.swing.JPanel();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Panel_Resultados = new javax.swing.JPanel();
        Lbl_Simbolo_Integracion = new javax.swing.JLabel();
        Lbl_Exponente_Denominador1 = new javax.swing.JLabel();
        Lbl_Denominador_U1 = new javax.swing.JLabel();
        Lbl_Linea_Division_Variable_Sustitucion = new javax.swing.JLabel();
        Lbl_Linea_Division_Integral = new javax.swing.JLabel();
        Lbl_Denominador_U = new javax.swing.JLabel();
        Lbl_Variable_Sustitucion_U = new javax.swing.JLabel();
        Lbl_Denominador_Resultado_Derivada = new javax.swing.JLabel();
        Lbl_Variable = new javax.swing.JLabel();
        Lbl_Linea_Constante = new javax.swing.JLabel();
        Lbl_Denominador_Constante = new javax.swing.JLabel();
        Lbl_Constante = new javax.swing.JLabel();
        Lbl_Linea_Fraccion2 = new javax.swing.JLabel();
        Lbl_Numerador_X = new javax.swing.JLabel();
        Lbl_Exponente_Denominador = new javax.swing.JLabel();
        Lbl_Exponente_Numerador = new javax.swing.JLabel();
        Lbl_Constante_Integracion = new javax.swing.JLabel();
        Combo_Box_Operaciones = new javax.swing.JComboBox<>();
        Txt_Polinomio_Opcion_1_2_3 = new javax.swing.JTextField();
        btcalcular = new javax.swing.JButton();
        Lbl_Exponente_Opcion_1_2_3 = new javax.swing.JTextField();
        Lbl_Linea_Fraccion_Opcion_3 = new javax.swing.JLabel();
        Txt_Denominador_Opcion_3 = new javax.swing.JTextField();
        Txt_Exponente_Denominador = new javax.swing.JTextField();
        Lbl_Diferencial_Opcion_2 = new javax.swing.JLabel();
        Txt_Polinomio_Opcion_2 = new javax.swing.JTextField();
        Txt_Exponente_Opcion_2 = new javax.swing.JTextField();
        Lbl_Diferencial_Opcion_1_3 = new javax.swing.JLabel();
        Btn_Siguiente_Proceso = new javax.swing.JButton();
        Lbl_Integral = new javax.swing.JLabel();
        Lbl_peticion_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);
        setUndecorated(true);
        setResizable(false);

        Panel_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Panel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Minimizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_Minimizar.setForeground(new java.awt.Color(22, 22, 22));
        btn_Minimizar.setText("—");
        btn_Minimizar.setBorder(null);
        btn_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Minimizar.setDefaultCapable(false);
        btn_Minimizar.setFocusPainted(false);
        btn_Minimizar.setFocusable(false);
        btn_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseExited(evt);
            }
        });
        btn_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizarActionPerformed(evt);
            }
        });
        Panel_Fondo.add(btn_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 50, 30));

        btn_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cerrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn_Cerrar.setForeground(new java.awt.Color(22, 22, 22));
        btn_Cerrar.setText("X");
        btn_Cerrar.setBorder(null);
        btn_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cerrar.setDefaultCapable(false);
        btn_Cerrar.setFocusPainted(false);
        btn_Cerrar.setFocusable(false);
        btn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseExited(evt);
            }
        });
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        Panel_Fondo.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 50, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel_Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 10));

        Panel_Resultados.setBackground(java.awt.Color.darkGray);
        Panel_Resultados.setForeground(java.awt.Color.darkGray);
        Panel_Resultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Simbolo_Integracion.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_Simbolo_Integracion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Simbolo_Integracion.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Simbolo_Integracion.setText("∫");
        Panel_Resultados.add(Lbl_Simbolo_Integracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        Lbl_Exponente_Denominador1.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Exponente_Denominador1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Lbl_Exponente_Denominador1.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Exponente_Denominador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Exponente_Denominador1.setToolTipText("");
        Lbl_Exponente_Denominador1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Exponente_Denominador1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Exponente_Denominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 50, 28));

        Lbl_Denominador_U1.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Denominador_U1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Lbl_Denominador_U1.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Denominador_U1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Denominador_U1.setToolTipText("");
        Lbl_Denominador_U1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Denominador_U1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Denominador_U1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, 30));

        Lbl_Linea_Division_Variable_Sustitucion.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Linea_Division_Variable_Sustitucion.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Resultados.add(Lbl_Linea_Division_Variable_Sustitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, 20));

        Lbl_Linea_Division_Integral.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Linea_Division_Integral.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Resultados.add(Lbl_Linea_Division_Integral, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, 20));

        Lbl_Denominador_U.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Denominador_U.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Lbl_Denominador_U.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Denominador_U.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel_Resultados.add(Lbl_Denominador_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 90, 30));

        Lbl_Variable_Sustitucion_U.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Variable_Sustitucion_U.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Variable_Sustitucion_U.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel_Resultados.add(Lbl_Variable_Sustitucion_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, 30));

        Lbl_Denominador_Resultado_Derivada.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Denominador_Resultado_Derivada.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Resultados.add(Lbl_Denominador_Resultado_Derivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 60, 30));

        Lbl_Variable.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Variable.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Resultados.add(Lbl_Variable, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, 30));

        Lbl_Linea_Constante.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Linea_Constante.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        Lbl_Linea_Constante.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Linea_Constante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Linea_Constante.setToolTipText("");
        Lbl_Linea_Constante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Linea_Constante.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Linea_Constante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 20));

        Lbl_Denominador_Constante.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Denominador_Constante.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Lbl_Denominador_Constante.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Denominador_Constante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Denominador_Constante.setToolTipText("");
        Lbl_Denominador_Constante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Denominador_Constante.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Denominador_Constante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 36, 28));

        Lbl_Constante.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Constante.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Lbl_Constante.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Constante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Constante.setToolTipText("");
        Lbl_Constante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Constante.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Constante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 36, 28));

        Lbl_Linea_Fraccion2.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Linea_Fraccion2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        Lbl_Linea_Fraccion2.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Linea_Fraccion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Linea_Fraccion2.setToolTipText("");
        Lbl_Linea_Fraccion2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Linea_Fraccion2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Linea_Fraccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 10));

        Lbl_Numerador_X.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Numerador_X.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Lbl_Numerador_X.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Numerador_X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Numerador_X.setToolTipText("");
        Lbl_Numerador_X.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Numerador_X.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Numerador_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 28));

        Lbl_Exponente_Denominador.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Exponente_Denominador.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Lbl_Exponente_Denominador.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Exponente_Denominador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Exponente_Denominador.setToolTipText("");
        Lbl_Exponente_Denominador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Exponente_Denominador.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Exponente_Denominador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 50, 28));

        Lbl_Exponente_Numerador.setBackground(new java.awt.Color(0, 204, 204));
        Lbl_Exponente_Numerador.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        Lbl_Exponente_Numerador.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Exponente_Numerador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Exponente_Numerador.setToolTipText("");
        Lbl_Exponente_Numerador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Exponente_Numerador.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel_Resultados.add(Lbl_Exponente_Numerador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 60, 28));

        Lbl_Constante_Integracion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Lbl_Constante_Integracion.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Resultados.add(Lbl_Constante_Integracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 60, 40));

        Panel_Fondo.add(Panel_Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 450, 180));

        Combo_Box_Operaciones.setBackground(new java.awt.Color(102, 185, 51));
        Combo_Box_Operaciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Combo_Box_Operaciones.setForeground(new java.awt.Color(255, 255, 255));
        Combo_Box_Operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "∫(___)dx", "∫(___)(___)dx", "∫(___) / (___)dx" }));
        Combo_Box_Operaciones.setBorder(null);
        Combo_Box_Operaciones.setLightWeightPopupEnabled(false);
        Combo_Box_Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_Box_OperacionesActionPerformed(evt);
            }
        });
        Panel_Fondo.add(Combo_Box_Operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));
        Panel_Fondo.add(Txt_Polinomio_Opcion_1_2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 34));

        btcalcular.setBackground(new java.awt.Color(102, 185, 51));
        btcalcular.setForeground(new java.awt.Color(255, 255, 255));
        btcalcular.setText("Calcular");
        btcalcular.setBorder(null);
        btcalcular.setBorderPainted(false);
        btcalcular.setDoubleBuffered(true);
        btcalcular.setFocusPainted(false);
        btcalcular.setFocusable(false);
        btcalcular.setRequestFocusEnabled(false);
        btcalcular.setVerifyInputWhenFocusTarget(false);
        btcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcularActionPerformed(evt);
            }
        });
        Panel_Fondo.add(btcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 70, 30));

        Lbl_Exponente_Opcion_1_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lbl_Exponente_Opcion_1_2_3ActionPerformed(evt);
            }
        });
        Panel_Fondo.add(Lbl_Exponente_Opcion_1_2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        Lbl_Linea_Fraccion_Opcion_3.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Linea_Fraccion_Opcion_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Lbl_Linea_Fraccion_Opcion_3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Linea_Fraccion_Opcion_3.setText("_________________");
        Panel_Fondo.add(Lbl_Linea_Fraccion_Opcion_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        Panel_Fondo.add(Txt_Denominador_Opcion_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 90, 34));

        Txt_Exponente_Denominador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Exponente_DenominadorActionPerformed(evt);
            }
        });
        Panel_Fondo.add(Txt_Exponente_Denominador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 30, 30));

        Lbl_Diferencial_Opcion_2.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_Diferencial_Opcion_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Lbl_Diferencial_Opcion_2.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Diferencial_Opcion_2.setText("dx");
        Panel_Fondo.add(Lbl_Diferencial_Opcion_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        Txt_Polinomio_Opcion_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_Polinomio_Opcion_2MouseClicked(evt);
            }
        });
        Panel_Fondo.add(Txt_Polinomio_Opcion_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 34));

        Txt_Exponente_Opcion_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Exponente_Opcion_2ActionPerformed(evt);
            }
        });
        Panel_Fondo.add(Txt_Exponente_Opcion_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 30, 30));

        Lbl_Diferencial_Opcion_1_3.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_Diferencial_Opcion_1_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Lbl_Diferencial_Opcion_1_3.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Diferencial_Opcion_1_3.setText("dx");
        Panel_Fondo.add(Lbl_Diferencial_Opcion_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        Btn_Siguiente_Proceso.setBackground(new java.awt.Color(102, 185, 51));
        Btn_Siguiente_Proceso.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Siguiente_Proceso.setText("Siguiente");
        Btn_Siguiente_Proceso.setBorder(null);
        Btn_Siguiente_Proceso.setBorderPainted(false);
        Btn_Siguiente_Proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Siguiente_ProcesoActionPerformed(evt);
            }
        });
        Panel_Fondo.add(Btn_Siguiente_Proceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 80, 30));

        Lbl_Integral.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_Integral.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Lbl_Integral.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Integral.setText("∫");
        Panel_Fondo.add(Lbl_Integral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 30, -1));

        Lbl_peticion_usuario.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Lbl_peticion_usuario.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_peticion_usuario.setText("Variable a sustituir ");
        Panel_Fondo.add(Lbl_peticion_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo de fondo integral-claro-negro.png"))); // NOI18N
        Panel_Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcularActionPerformed
        Btn_Siguiente_Proceso.setVisible(true);
        Calcular_Derivada();
    }//GEN-LAST:event_btcalcularActionPerformed

    private void Lbl_Exponente_Opcion_1_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lbl_Exponente_Opcion_1_2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Exponente_Opcion_1_2_3ActionPerformed

    private void Combo_Box_OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_Box_OperacionesActionPerformed
        SeleccionOperaciones();
         Btn_Siguiente_Proceso.setVisible(false);
    }//GEN-LAST:event_Combo_Box_OperacionesActionPerformed

    private void Txt_Exponente_DenominadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Exponente_DenominadorActionPerformed

    }//GEN-LAST:event_Txt_Exponente_DenominadorActionPerformed

    private void Txt_Exponente_Opcion_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Exponente_Opcion_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Exponente_Opcion_2ActionPerformed

    private void Btn_Siguiente_ProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Siguiente_ProcesoActionPerformed
        // TODO add your handling code here:
        Resultados();
    }//GEN-LAST:event_Btn_Siguiente_ProcesoActionPerformed

    private void btn_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_CerrarMouseClicked

    private void btn_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseEntered
        // TODO add your handling code here:
        btn_Cerrar.setBackground(red);
    }//GEN-LAST:event_btn_CerrarMouseEntered

    private void btn_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseExited
        // TODO add your handling code here:
        btn_Cerrar.setBackground(white);
    }//GEN-LAST:event_btn_CerrarMouseExited

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void Txt_Polinomio_Opcion_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Polinomio_Opcion_2MouseClicked
        // TODO add your handling code here:
        Lbl_peticion_usuario.setVisible(false);
    }//GEN-LAST:event_Txt_Polinomio_Opcion_2MouseClicked

    private void btn_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_MinimizarMouseClicked

    private void btn_MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseEntered
        // TODO add your handling code here:
        btn_Minimizar.setBackground(new java.awt.Color(98,98,98));
    }//GEN-LAST:event_btn_MinimizarMouseEntered

    private void btn_MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseExited
        // TODO add your handling code here:
        btn_Minimizar.setBackground(Color.white);
    }//GEN-LAST:event_btn_MinimizarMouseExited

    private void btn_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MinimizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(integral_claro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(integral_claro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(integral_claro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(integral_claro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new integral_claro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Siguiente_Proceso;
    private javax.swing.JComboBox<String> Combo_Box_Operaciones;
    private javax.swing.JLabel Lbl_Constante;
    private javax.swing.JLabel Lbl_Constante_Integracion;
    private javax.swing.JLabel Lbl_Denominador_Constante;
    private javax.swing.JLabel Lbl_Denominador_Resultado_Derivada;
    private javax.swing.JLabel Lbl_Denominador_U;
    private javax.swing.JLabel Lbl_Denominador_U1;
    private javax.swing.JLabel Lbl_Diferencial_Opcion_1_3;
    private javax.swing.JLabel Lbl_Diferencial_Opcion_2;
    private javax.swing.JLabel Lbl_Exponente_Denominador;
    private javax.swing.JLabel Lbl_Exponente_Denominador1;
    private javax.swing.JLabel Lbl_Exponente_Numerador;
    private javax.swing.JTextField Lbl_Exponente_Opcion_1_2_3;
    private javax.swing.JLabel Lbl_Integral;
    private javax.swing.JLabel Lbl_Linea_Constante;
    private javax.swing.JLabel Lbl_Linea_Division_Integral;
    private javax.swing.JLabel Lbl_Linea_Division_Variable_Sustitucion;
    private javax.swing.JLabel Lbl_Linea_Fraccion2;
    private javax.swing.JLabel Lbl_Linea_Fraccion_Opcion_3;
    private javax.swing.JLabel Lbl_Numerador_X;
    private javax.swing.JLabel Lbl_Simbolo_Integracion;
    private javax.swing.JLabel Lbl_Variable;
    private javax.swing.JLabel Lbl_Variable_Sustitucion_U;
    private javax.swing.JLabel Lbl_peticion_usuario;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JPanel Panel_Resultados;
    private javax.swing.JTextField Txt_Denominador_Opcion_3;
    private javax.swing.JTextField Txt_Exponente_Denominador;
    private javax.swing.JTextField Txt_Exponente_Opcion_2;
    private javax.swing.JTextField Txt_Polinomio_Opcion_1_2_3;
    private javax.swing.JTextField Txt_Polinomio_Opcion_2;
    private javax.swing.JButton btcalcular;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
