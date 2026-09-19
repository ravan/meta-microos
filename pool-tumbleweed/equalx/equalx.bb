SUMMARY = "Editor for writing and exporting TeX/LaTeX equations"
DESCRIPTION = "EqualX is a helpful graphical interface to LaTeX programs. \
It gives you the power and beauty for writing TeX/LaTeX equations \
in a simple to use editor. \
 \
Features included: \
* Highlight find results in the Equation Preview; \
* 3 modes for Refreshing the Preview \
* Customise the export commands \
* Professional & customisable window layout \
* Equation font is computed according to desktop DPI \
* Reshaping the Symbols toolbar and Templates toolbar"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "equalx-0.7.1-9.9.aarch64.rpm"
RPM_HASH = "b8d2de5196ba2788ab3309272d434437c1309ace360119332f7836b300721c5c7e337a4140d959cef8ff9db04e0640ac59356850f3d1ebba320a1addf436ff93"

RPROVIDES:${PN} += "equalx"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libexempi.so.8 \
libgcc-s.so.1 \
libstdc++.so.6 \
poppler-tools \
texlive-latex"

inherit rpm
