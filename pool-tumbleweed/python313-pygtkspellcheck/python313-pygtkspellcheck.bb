SUMMARY = "A spellchecking library for GTK written in pure Python"
DESCRIPTION = "Python GTK Spellcheck is a simple but quite powerful spellchecking library for \
GTK written in pure Python. Its spellchecking component is based on Enchant and \
it supports both GTK 3 and 4 via PyGObject."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.4"

RPM_NAME = "python313-pygtkspellcheck-5.0.4-1.2.noarch.rpm"
RPM_HASH = "c5ce0967d683c51e462529a2c12729f4396b63dd7bd9752848b6526390de57aa27837c020a4c228c00f28a7475367082e6ef7dc1bf4baafaf59087ccde0d8104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gtkspellcheck \
python3-pygtkspellcheck \
python3.13dist-pygtkspellcheck \
python313-gtkspellcheck \
python313-pygtkspellcheck \
python3dist-pygtkspellcheck"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
python313-pyenchant"

inherit rpm
