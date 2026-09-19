SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk4-branding-openSUSE-15.0-3.39.noarch.rpm"
RPM_HASH = "506eaa57dada0efe36a71f81a7a9f322280e40ec5ca9db6e1c1329549dafb96fbd9155229134deeb320a82938ccefe67baa58be7eb89412f59410c4d33eda408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-openSUSE"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
