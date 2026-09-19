SUMMARY = "Fish Completion for python-uv"
DESCRIPTION = "Fish command-line completion support for python-uv."
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "0.12.13"

RPM_NAME = "uv-fish-completion-0.12.13-1.1.noarch.rpm"
RPM_HASH = "126b6c0c2e35f86bb530dab52d70efb921ab2be3c58c3c1c881f46423425f83d94135fc41ca932f94833a90e8a4a12344358302e50e3ba7ca159a36631fb7872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-uv-fish-completion \
uv-fish-completion"

RDEPENDS:${PN} += "fish \
uv"

inherit rpm
