SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python314-pandocfilters-1.5.1-2.5.noarch.rpm"
RPM_HASH = "db27847dd1ffcebae79432a2b6bb34d48f5074b084a6ea77224c665b960f11aa62d0387a5275c8b234631d7e0177184a9dfc5dd04ea384082e6bb325b7b41c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pandocfilters \
python314-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
