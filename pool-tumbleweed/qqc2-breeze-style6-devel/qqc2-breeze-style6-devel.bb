SUMMARY = "Development Files for the Breeze Qt Quick Controls 2 Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-breeze-style6. \
Usually not needed as it is only a runtime dependency."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "qqc2-breeze-style6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "9de4e155d9059bf4c16d808f81c44f25e10d662b46dca0e21ffc8944330812b77e9695f8a72e1fa6d4b269eef8fe7c37d4ca4438716a8a46d6a819bf23f65806"

RPROVIDES:${PN} += "cmake-QQC2BreezeStyle \
qqc2-breeze-style6-devel"

RDEPENDS:${PN} += "kf6-extra-cmake-modules \
qqc2-breeze-style6"

inherit rpm
