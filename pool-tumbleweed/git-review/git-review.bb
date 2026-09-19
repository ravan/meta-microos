SUMMARY = "Tool to submit code to Gerrit"
DESCRIPTION = "A git command for submitting branches to Gerrit \
 \
git-review is a tool that helps submitting git branches to gerrit for \
review."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "git-review-2.5.0-1.3.noarch.rpm"
RPM_HASH = "332b75f099cb95ff3910b944d6defecb89227838609fa98fab121bcfc2194076620f3cf1e5532982107089324a03a495d57103a375f56768932b5f9bb5e86b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-review \
python3-git-review \
python3.13dist-git-review \
python3dist-git-review"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-requests"

inherit rpm
