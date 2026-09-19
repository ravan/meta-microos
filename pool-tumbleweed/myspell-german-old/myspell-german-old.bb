SUMMARY = "Old German Dictionary for MySpell"
DESCRIPTION = "This dictionary supports spell checking according to the old German spelling \
rules. \
 \
MySpell dictionaries are compatible with MySpell and Hunspell spell-checker. \
They are used by various desktop applications, for example, LibreOffice, \
Mozilla Thunderbird, and Mozilla Firefox."
LICENSE = "GPL-2.0+"

PV = "20030428"

RPM_NAME = "myspell-german-old-20030428-265.24.noarch.rpm"
RPM_HASH = "1171c22e3e1266b19d95bd6f0278f4a76076153a8cdda7dd8f110f54e6d2e1a4070e2109389d814e57c10157a988a1dc93e4a044573d3fbfeaa59c37c6b02dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "myspell-dictionary \
myspell-german-dictionary \
myspell-german-old"

RDEPENDS:${PN} += ""

inherit rpm
