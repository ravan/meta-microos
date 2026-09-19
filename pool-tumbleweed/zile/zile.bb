SUMMARY = "Lightweight Emacs Clone"
DESCRIPTION = "Zile is another Emacs-clone.  Zile is a customizable, self-documenting \
real-time, open-source display editor.  Zile was written to be as similar \
as possible to Emacs; every Emacs user should feel at home with Zile."
LICENSE = "GPL-3.0-only"

PV = "2.6.4"

RPM_NAME = "zile-2.6.4-1.6.aarch64.rpm"
RPM_HASH = "bffeb286da3db72da4eca61a423f121f771ace6ea57df1442d41531510900e0420092338791036c3ddedc9b96902753c2a312d6912758df824229b31f39744a2"

RPROVIDES:${PN} += "zile \
zile-base \
zile-desktop \
zile-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
