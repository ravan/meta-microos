SUMMARY = "SGML-Tools - LaTeX generator"
DESCRIPTION = "This package contains the LaTeX generator (sgml2latex) from sgmltool."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.9"

RPM_NAME = "sgmltool-latex-1.0.9-1080.8.aarch64.rpm"
RPM_HASH = "cf5187cbf3bdb3af82401ef843b3cf0dd7d6616e7b10a34fd36153a740d3e71a8e9257b8a0dcb7b7b38f6e80b6fd63ccad6ebbf7ae0ac62dff682bc677859661"

RPROVIDES:${PN} += "sgmltool-/usr/bin/sgml2latex \
sgmltool-latex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
sgmltool \
texlive-epsf \
texlive-filesystem \
texlive-kpathsea \
texlive-latex \
texlive-url"

inherit rpm
