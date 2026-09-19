SUMMARY = "A document formatting system"
DESCRIPTION = "Lout is a document formatting system. The system reads a high-level \
description of a document similar in style to LaTeX and produces a \
PostScript file. Plain text output is also available, PDF output is \
limited but working (e.g. no graphics). Either of these may be \
fed to a printer. Lout is offered in multiple languages."
LICENSE = "GPL-2.0-or-later"

PV = "3.41.0"

RPM_NAME = "lout-3.41.0-2.7.aarch64.rpm"
RPM_HASH = "10260e421e9e385fde8ef675e00289878e7af31ab6bb28dfb8cb980594df3198b63733b7456c85ff1809d926de1867156097bb0097e11fb1ab9c9f9011d37320"

RPROVIDES:${PN} += "lout"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
