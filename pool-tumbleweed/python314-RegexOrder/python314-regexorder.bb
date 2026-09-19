SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python314-RegexOrder-0.2-5.5.noarch.rpm"
RPM_HASH = "15be22db31e99ae63a439ee4d1f7b70b23ac2396c1b815076e4d8e555650120cdccae7d1a6a012191c992d40c6f829e693244c95e7f8bdccbcddfa6945ccd8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-regexorder \
python314-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python314-regex"

inherit rpm
