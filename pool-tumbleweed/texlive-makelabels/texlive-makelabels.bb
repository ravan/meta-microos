SUMMARY = "Add a '\\makelabels' feature to KOMA-Script letter classes and package"
DESCRIPTION = "The standard letter class letter has a label feature. You can \
activate it using \\makelabels. While in Germany window \
envelopes are common, printing labels is not common, and \
scrlttr2 has never supported label printing. Using \
makelabels.lco does implement a \\makelabels feature similar to \
the standard letter classes. Currently there are (almost) no \
configuration features for makelabels.lco. But you may use the \
envlab package after loading makelabels.lco to get various \
configuration features."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn60255"

RPM_NAME = "texlive-makelabels-2026.226.1.0svn60255-59.2.noarch.rpm"
RPM_HASH = "e6046e83667d0ed65562c6549e9b8e1ef80a2c8d1a8421534ca7cd12653d6704aa8e7d67c8f07804c3ef6735aa4a67a25b143151fab5a9945efcb91128b43bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makelabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
