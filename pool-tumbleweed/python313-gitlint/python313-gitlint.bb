SUMMARY = "Git commit message linter checking"
DESCRIPTION = "Great for use as a commit-msg git hook or as part of your gating script in \
a CI/CD pipeline (e.g. jenkins). Many of the gitlint validations are based \
on well-known community standards, others are based on checks that we've \
found useful throughout the years. Gitlint has sane defaults, but you can \
also easily customize it to your own liking."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python313-gitlint-0.18.0-2.8.noarch.rpm"
RPM_HASH = "9d22c80b7dfd1b07e769cafd88686ba76c2822c54e25e2d3bc31991d7a38111988cf056e071e1af1c86955a4860249241513926f2a8f313b050009c2b80cda0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gitlint \
python3.13dist-gitlint-core \
python313-gitlint \
python3dist-gitlint-core"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-arrow \
python313-click \
python313-sh \
update-alternatives"

inherit rpm
