SUMMARY = "Universial predictive text companion"
DESCRIPTION = "Pypresagemate is a universal predictive text companion. Pypresagemate works alongside any AT-SPI aware application. The Assistive Technology Service Provider Interface (AT-SPI) is a toolkit-neutral way of providing accessibility facilities in applications. Pypresagemate works in the background by tracking what keystrokes are typed and displaying predictions in its window. When a prediction is selected, text is sent to the active application."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presagemate-0.9.1-18.6.noarch.rpm"
RPM_HASH = "063fb8b83976183470995fe572dd6c60a2fb0447ad0973c1ee0536963834af5b23ac9370176885ede39f0f107a465fc82f2429bf2166e80707c46bb9f69d8b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-presagemate \
python3-presagemate"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-atspi \
python3-gobject \
python3-presage \
python3-xlib \
typelib-Gdk \
typelib-Gtk \
typelib-Pango"

inherit rpm
