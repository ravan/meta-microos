SUMMARY = "Login manager user avatars"
DESCRIPTION = "This package provides user avatars to be used by display managers"
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-control-center-user-faces-50.4-1.1.noarch.rpm"
RPM_HASH = "38249f37e0feacb6cbe7ad49a8d7de49acfd2f9754b17b45cc3364144109807372f30b43c6b6c57d18dc76103bd946c0f95c786cd519270c4b63fd7b828cfa20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-user-faces"

RDEPENDS:${PN} += ""

inherit rpm
