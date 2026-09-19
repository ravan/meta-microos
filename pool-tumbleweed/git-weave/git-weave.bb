SUMMARY = "Weave a tarball sequence into a git repository"
DESCRIPTION = "git-weave takes a tarball sequence and a metadata file and synthesizes a live \
repository. It can invert this, explode git repositories into sequences of \
per-commit tarballs. The DAG is expressed as a metadata file with mailbox-like \
entries."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "git-weave-1.5-1.3.noarch.rpm"
RPM_HASH = "02df77f8a5ac7fa78402c390abf3764c67e91932ce3b31bc0dc1b3746da8bdbfb983a91c7523f26b41a8332751456c176f0aece6f31c8d18bdf3dc5e9c2db68b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-weave"

RDEPENDS:${PN} += "/usr/bin/python3 \
cpio \
find \
git-core"

inherit rpm
