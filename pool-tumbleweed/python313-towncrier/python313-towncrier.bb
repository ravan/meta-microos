SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "25.8.0"

RPM_NAME = "python313-towncrier-25.8.0-1.3.noarch.rpm"
RPM_HASH = "348d022f77dfc178fc51ca260dcaa076262dc06282ae7584a6cce619e5807f679305bf0160e1c17c17c1a12a4af97a596eb44a166432911d7067117a8c463436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-towncrier \
python3.13dist-towncrier \
python313-towncrier \
python3dist-towncrier"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
python-abi \
python313-Jinja2 \
python313-click \
update-alternatives"

inherit rpm
