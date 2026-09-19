SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python313-pandocfilters-1.5.1-2.5.noarch.rpm"
RPM_HASH = "49f18bb90cc9013adc34a7248f8404414f2818db41b512eb11b604a32b465c01ce9b0b2649678b4721bfaad730c803d4baacf373df6ed33dd6a3cdfed3090dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandocfilters \
python3.13dist-pandocfilters \
python313-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
