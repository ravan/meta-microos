SUMMARY = "Prompt dialog for gcr"
DESCRIPTION = "This package provides the prompt dialog needed by libgcr."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-prompter-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "4398d1bb4a13dc51a52079148a3b955c50893d6470d2c37d8e88f6dfc00dd5934c417e37a8a47d98033260a23e19ae0603a97956a344fc378bf5bdb9d6cf57f4"

RPROVIDES:${PN} += "gcr-prompter \
gcr3-prompter"

RDEPENDS:${PN} += "libc.so.6 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
