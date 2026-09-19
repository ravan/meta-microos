SUMMARY = "Lilypond editor"
DESCRIPTION = "Frescobaldi is a LilyPond sheet music editor. It aims to be powerful, yet \
lightweight and easy to use. \
 \
You can edit LilyPond documents and build and preview them with a mouse click. \
Clicking on notes in the PDF preview places the text cursor in the right place. \
A score wizard is provided to quickly setup a music score. There are editing \
tools to manipulate the rhythm, acticulations, lyrics hyphenation, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.7"

RPM_NAME = "frescobaldi-4.0.7-1.3.noarch.rpm"
RPM_HASH = "eb69bbc67db65c82babc5b9fe080e046be7b67abaf510d9127a9a9e2b0862f1fb7deee287957e071fb4072a51fcda690bcf5a3c206ea52242131a940d8acf80e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frescobaldi \
python3.13dist-frescobaldi \
python3dist-frescobaldi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
lilypond \
python-abi \
python3-PyQt6-sip \
python3-ly \
python3-qpageview \
python3-qt6 \
python3-qtwebengine-qt6"

inherit rpm
