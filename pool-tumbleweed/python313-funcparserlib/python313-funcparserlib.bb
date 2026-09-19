SUMMARY = "Recursive descent parsing library based on functional combinators"
DESCRIPTION = "The primary focus of funcparserlib is parsing little languages or external \
DSLs (domain specific languages). \
 \
Parsers made with funcparserlib are pure-Python LL(*) parsers. It means that \
it's very easy to write parsers without thinking about lookaheads and other \
hardcore parsing stuff. However, recursive descent parsing is a rather \
low method compared to LL(k) or LR(k) algorithms. Still, parsing with \
funcparserlib is at least twice faster than PyParsing, a very popular library \
for Python."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-funcparserlib-1.0.1-1.16.noarch.rpm"
RPM_HASH = "63f24d6724a118dca72c496dd9958016fef1d92a3cda6f0869481538a2668f08fc45aa4567593ad426564d73e7786fe9755365b8b4baed17b781d87b308f0d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-funcparserlib \
python3.13dist-funcparserlib \
python313-funcparserlib \
python3dist-funcparserlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
