SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python314-TermRecord-1.2.5-6.5.noarch.rpm"
RPM_HASH = "ec74773882f9d900655257d023071e082afe71815713beef2787891219af4f69af3a1a88dddf9252677dcf1c7c25e440ff3e7d71b423d9270ec487fe9cc0e245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-termrecord \
python314-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2"

inherit rpm
