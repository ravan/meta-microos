SUMMARY = "Lightweight configuration file parser library with XDG path helpers"
DESCRIPTION = "Canfigger is a lightweight C language library designed to parse configuration \
files. It provides functionality to read them and represent their contents as \
a linked list of key-value pairs, along with associated attributes for each \
pair. It also includes utility functions for locating standard per-user \
directories (config, data, cache) and joining paths, with support for XDG on \
Linux/macOS and the Windows CSIDL equivalents. \
 \
This package contains the shared library for canfigger"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libcanfigger0-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "5933996a37aa0f1d4769a42bd498cde406bb01ce6f0c1e2878cfceff9be9c81da9b47f69e2f7c545115f0fe63c9432d6fbc29d54ca56e2c944b8adbf1276a328"

RPROVIDES:${PN} += "libcanfigger.so.0 \
libcanfigger0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
