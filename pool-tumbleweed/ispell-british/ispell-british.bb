SUMMARY = "British ispell dictionary"
DESCRIPTION = "This packages includes a ready British dictionary for ispell. If you \
install ispell-american too, check /etc/sysconfig/ispell to see which \
one will be the default English dictionary. A short usage description \
is given in /usr/share/doc/packages/ispell/README. The sources for this \
dictionary are included in the source package of ispell."
LICENSE = "BSD-3-Clause"

PV = "3.4.06"

RPM_NAME = "ispell-british-3.4.06-5.1.aarch64.rpm"
RPM_HASH = "8aa2314c551b3c60737c48accae1404985fff25b84e63cf7c568b0ba08ff1d16ca406692e0d9c63b1738cdc50ccbfcb9253e3690f642ee64ad468d93d1eb8538"

RPROVIDES:${PN} += "ibritish \
ispell-british \
ispell-dictionary \
ispell-english-dictionary \
locale-ispell-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
fileutils \
ispell"

inherit rpm
