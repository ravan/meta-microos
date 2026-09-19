SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "python313-liblarch-gtk-3.2.0-2.10.noarch.rpm"
RPM_HASH = "e649734bf963f0c80f62f89d43b62a83fc5b60d5deb76aee1efd089aee6569cc93fb270cbb1e9b1ae2e20a309c170806af5003464442b401e035c3d87c7c0d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblarch-gtk \
python313-liblarch-gtk"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
python313-liblarch \
typelib-Gtk"

inherit rpm
