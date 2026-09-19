SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python313-TermRecord-1.2.5-6.5.noarch.rpm"
RPM_HASH = "a6ea7d0f99d8f19e61b4c442cc0912552caa9a6489660dbbfcf31625df8d1fd8b1ad6c1878ff8bcf0c3ad9035297076fa670968cb45d800d5fa3c8baa6ba0e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TermRecord \
python3.13dist-termrecord \
python313-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2"

inherit rpm
