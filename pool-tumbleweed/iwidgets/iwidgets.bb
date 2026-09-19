SUMMARY = "Widget Extension for Tcl/Tk"
DESCRIPTION = "[incr Widgets] is an object-oriented mega-widget set that extends \
Tcl/Tk and is based on [incr Tcl] and [incr Tk].  This set of \
mega-widgets delivers many new, general purpose widgets like option \
menus, comboboxes, selection boxes, and various dialogs whose \
counterparts are found in Motif and Windows. Since [incr Widgets] is \
based on the [incr Tk] extension, the Tk framework of configuration \
options, widget commands, and default bindings is maintained.  In other \
words, each [incr Widgets] mega-widget seamlessly blends with the \
standard Tk widgets. They look, act, and feel like Tk widgets. In \
addition, all [incr Widgets] mega-widgets are object oriented and may \
themselves be extended, using either inheritance or composition."
LICENSE = "MIT"

PV = "4.1"

RPM_NAME = "iwidgets-4.1-5.24.noarch.rpm"
RPM_HASH = "cf7bd00e802f9a3dd1f2ccd6b0fede6c5b171cd3095cfbe9990c1cad343edf0377bf73758a4f2433d523c2e943d370acd207623fe21067011aa281792207453b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iwidgets"

RDEPENDS:${PN} += "itk"

inherit rpm
