SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.9"

RPM_NAME = "python314-txt2tags-3.9-2.5.noarch.rpm"
RPM_HASH = "e7a49151efd005acf76310467a1e4ad90d8f1c66eeeb4512a5f477d723253bd7733306cc872c52bffba87a6ac9091916677ea298a2fc77329eac0d24643d6808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-txt2tags \
python314-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
