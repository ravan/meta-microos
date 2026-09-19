SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python313-RegexOrder-0.2-5.5.noarch.rpm"
RPM_HASH = "0dd79331edddfad3e6b6abe3a21bab5af536b5aa32f1b8b675af834b9dcd10e89a5e9e64c52b173b4dd9e85a6ceab69d5af16bac1119e5dee95b70e6d5ddbfa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-RegexOrder \
python3.13dist-regexorder \
python313-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python313-regex"

inherit rpm
