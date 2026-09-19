SUMMARY = "Quickly rewrite git repository history (git-filter-branch replacement)"
DESCRIPTION = "git filter-repo is a versatile tool for rewriting history, which includes \
capabilities not found anywhere else. It roughly falls into the same space of \
tool as git filter-branch but without the capitulation-inducing poor \
performance, with far more capabilities, and with a design that scales \
usability-wise beyond trivial rewriting cases."
LICENSE = "GPL-2.0-only | MIT"

PV = "2.47.0"

RPM_NAME = "git-filter-repo-2.47.0-2.5.noarch.rpm"
RPM_HASH = "e875c5095a431bbe177aa45926c0b2b57fa8c07a5754c5b49e585c06882a1eb0d458f77bcc7c02b972336c77d40602e1d2b0542a2372503d809080fa1ad7e92d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-filter-repo"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
python-abi"

inherit rpm
