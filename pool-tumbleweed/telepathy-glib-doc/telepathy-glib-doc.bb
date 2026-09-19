SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Developer documentation"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "telepathy-glib-doc-0.24.2-3.9.aarch64.rpm"
RPM_HASH = "3c4c2b5780a65f9cad49d1b9c2a55934aca79a57ec7861de8784823c544ac64201b96ed0859d6ffe6409aa5612b6f39561de72562d72bf7ea08a9289b4d83b96"

RPROVIDES:${PN} += "telepathy-glib-doc"

RDEPENDS:${PN} += "libtelepathy-glib0"

inherit rpm
