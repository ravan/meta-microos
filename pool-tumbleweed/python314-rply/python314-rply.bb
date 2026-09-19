SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python314-rply-0.7.8-2.16.noarch.rpm"
RPM_HASH = "f581b3f93a8cd0020b84a0bab4a68f683a8569719fa1f43a372b2cc221ebe7c20fd6697990f5f07bc8782bf9fd45e732ddb3849da91ac39e5493afa11cf83a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rply \
python314-rply \
python3dist-rply"

RDEPENDS:${PN} += "python-abi \
python314-appdirs"

inherit rpm
