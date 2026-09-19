SUMMARY = "A spellchecking library for GTK written in pure Python"
DESCRIPTION = "Python GTK Spellcheck is a simple but quite powerful spellchecking library for \
GTK written in pure Python. Its spellchecking component is based on Enchant and \
it supports both GTK 3 and 4 via PyGObject."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.4"

RPM_NAME = "python314-pygtkspellcheck-5.0.4-1.2.noarch.rpm"
RPM_HASH = "13d5e9b0e28ae294fb90951c50482b6b4e1059541a584585516ea67bf555e0e94622448e0b01b27b900e7a33379d1cfe4e36b59d184e4bbda76bb78a1a6ca3ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygtkspellcheck \
python314-gtkspellcheck \
python314-pygtkspellcheck \
python3dist-pygtkspellcheck"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
python314-pyenchant"

inherit rpm
