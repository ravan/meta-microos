SUMMARY = "Git credential helper that authenticates to GitHub and other forges using OAuth"
DESCRIPTION = "A Git credential helper that securely authenticates to GitHub, GitLab, BitBucket and Gerrit using OAuth. \
The first time you authenticate, the helper opens a browser window to the host. Subsequent authentication \
within storage lifetime is non interactive."
LICENSE = "Apache-2.0"

PV = "0.17.2"

RPM_NAME = "git-credential-oauth-0.17.2-1.7.aarch64.rpm"
RPM_HASH = "2bb6bc2604fd53e95a49d496199319678069ef7dcd883fa24ebd779fce5b004acf2a37e7f092038b86cac92efcf2734a909a446b0161d063ad864461709acefc"

RPROVIDES:${PN} += "git-credential-oauth"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
