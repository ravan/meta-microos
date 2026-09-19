SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.9"

RPM_NAME = "python313-txt2tags-3.9-2.5.noarch.rpm"
RPM_HASH = "4e9912f29f0bca460623be6041480cc18952369b5fe094330138ec286ef1c418c8bf0d324668d142b5ebdbaab29148e570875f0161d4b0bdcaa661394d91edbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txt2tags \
python3.13dist-txt2tags \
python313-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
