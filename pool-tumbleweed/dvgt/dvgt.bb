SUMMARY = "A DVI Previewer"
DESCRIPTION = "Dvgt is a DVI previewer for console, terminals, and graphical terminals \
like Tektronics or the good old XTerm. dvgt tries to fit the conditions \
of the DVI files, therefore output on text terminals is not legible."
LICENSE = "SUSE-Public-Domain"

PV = "3.51L3"

RPM_NAME = "dvgt-3.51L3-1310.1.aarch64.rpm"
RPM_HASH = "e31389913f050d35eb8e0f0660f7698d8403c24b6cdfc4522411f43e58d7107404485dd59a452698ca55a2d66bf4d4b7d840cec03baf9f22e68af1a3c9945cd3"

RPROVIDES:${PN} += "dvgt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive"

inherit rpm
