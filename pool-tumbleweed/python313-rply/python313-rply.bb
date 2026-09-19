SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python313-rply-0.7.8-2.16.noarch.rpm"
RPM_HASH = "73c76607e6f5baa6ad1d8ba86c6c1d1274db067306a4a599b417695b892131cc7757b8794ef5101ba12f3193a1dee888513df77c57356dcc6feb5baa7fb93519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rply \
python3.13dist-rply \
python313-rply \
python3dist-rply"

RDEPENDS:${PN} += "python-abi \
python313-appdirs"

inherit rpm
