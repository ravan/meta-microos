SUMMARY = "Tool to analyze git deps"
DESCRIPTION = "Tool to analyze git dependencies \
 \
file bugs at https://github.com/aspiers/git-deps/issues"
LICENSE = "GPL-2.0-only"

PV = "1.1.0+git.1696898573.89d51e8"

RPM_NAME = "git-deps-1.1.0+git.1696898573.89d51e8-4.2.noarch.rpm"
RPM_HASH = "02b5e1c8e0f9dda0c377ee39a5e1a792411c744f40e3e96aac8ebc7278cdce62132d83e52503d57dfa68e70b61245555625a8f0ac99d48f2bb9974c609b7a311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps \
python3.13dist-git-deps \
python3dist-git-deps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
git \
npm \
python-abi \
python3-Flask \
python3-pygit2"

inherit rpm
