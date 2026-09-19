SUMMARY = "Documentation for texlive-grundgesetze"
DESCRIPTION = "This package includes the documentation for texlive-grundgesetze"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-doc-2026.226.1.03svn58997-60.4.noarch.rpm"
RPM_HASH = "7cb04ce38f4ccf164484036e22c2846a03932eb7c78ca7579cd84fab9006519cfd136e570dc8105b503a445bb61c71db46d2beb14fe64e96fa151cf79861cb90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grundgesetze-doc"

RDEPENDS:${PN} += ""

inherit rpm
