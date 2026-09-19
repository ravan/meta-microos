SUMMARY = "A lite-xl plugin manager"
DESCRIPTION = "* A standalone binary that provides an easy way of installing, and uninstalling \
  plugins from lite-xl, as well as different version of lite-xl. \
* Can be used by a package manager plugin that works from inside the editor and \
  calls this binary. \
* Also contains a plugin_manager.lua plugin to integrate the binary with lite \
  in the form of an easy-to-use GUI. \
* By default in releases, lpm will automatically consume the manifest.json in \
  the latest branch of this repository, which corresponds to the most recent \
  versioned release. \
* Conforms to SCPS3."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & Zlib & SUSE-GPL-2.0-with-linking-exception"

PV = "1.4.7+git20260506.ece8d63"

RPM_NAME = "lite-xl-plugin-manager-1.4.7+git20260506.ece8d63-1.3.aarch64.rpm"
RPM_HASH = "e73fedca5713b0a418e6b43dcadce6698389b11963050a9e8488b72e2f4050e42985e5d4bfe6b50412a0fef587bb99482290c25f6ed97d103df87fcfd89f591b"

RPROVIDES:${PN} += "lite-xl-plugin-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.9 \
liblua5.4.so.5 \
liblzma.so.5 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libz.so.1 \
libzip.so.5 \
lite-xl"

inherit rpm
