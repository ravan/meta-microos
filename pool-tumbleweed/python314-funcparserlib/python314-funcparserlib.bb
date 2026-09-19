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

RPM_NAME = "python314-funcparserlib-1.0.1-1.16.noarch.rpm"
RPM_HASH = "f2a35ce86f5da07fbf9e96525a9db80805ac79f4617d8f39a0c1e48ef638a859d3e0db0e2d7a986ac89ef406eaea95bc8e8292441bd29b053ef395b9901a1855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-funcparserlib \
python314-funcparserlib \
python3dist-funcparserlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
