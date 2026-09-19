SUMMARY = "Library for package, patch, pattern and product management"
DESCRIPTION = "libzypp is the package management library that powers applications \
like YaST, zypper and the openSUSE/SLE implementation of PackageKit. \
 \
libzypp provides functionality for a package manager: \
 \
  * An API for package repository management, supporting most common \
    repository metadata formats and signed repositories. \
  * An API for solving packages, products, patterns and patches \
    (installation, removal, update and distribution upgrade \
    operations) dependencies, with additional features like locking. \
  * An API for commiting the transaction to the system over a rpm \
    target. Supporting deltarpm calculation, media changing and \
    installation order calculation. \
  * An API for browsing available and installed software, with some \
    facilities for programs with an user interface."
LICENSE = "GPL-2.0-or-later"

PV = "17.38.15"

RPM_NAME = "libzypp-17.38.15-1.1.aarch64.rpm"
RPM_HASH = "4274ee60fcec532a46c99a5524f7b7670d2a1e5616ea41d06043fa203fd808b5d626c6e5a445193eff7744a89e1c8e32d2db9e1958e5c88981cb0134c1e376d1"

RPROVIDES:${PN} += "config-libzypp \
libzypp \
libzypp-econf \
libzypp-plugin \
libzypp-plugin-appdata \
libzypp-plugin-commit \
libzypp-plugin-repoverification \
libzypp-plugin-services \
libzypp-plugin-sigcheck \
libzypp-plugin-system \
libzypp-plugin-urlresolver \
libzypp-repovarexpand \
libzypp.so.1735 \
yast2-packagemanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libcurl4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpgme.so.45 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libsigc-2.0.so.0 \
libsolv-tools-base \
libstdc++.so.6 \
libudev.so.1 \
libxml2.so.16 \
libyaml-cpp.so.0.9 \
libz.so.1 \
libzck.so.1 \
libzstd.so.1 \
rpm"

inherit rpm
