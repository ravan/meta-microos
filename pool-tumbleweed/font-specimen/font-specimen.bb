SUMMARY = "Font Specimen Creator"
DESCRIPTION = "Creates specimen for given installed font and script it \
sufficiently coverages. Run font-specimen without \
parameters to see usage."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "font-specimen-20150202-3.30.aarch64.rpm"
RPM_HASH = "1f3abf523046d2f8aa6eb81397793c85983689e6c7a70a949247295379f66becac656fd941fd26c59e8a6b1eb25132d29cee9383019038ced03f8f4fb9adeb06"

RPROVIDES:${PN} += "font-specimen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfont-specimen.so.0"

inherit rpm
