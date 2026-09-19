SUMMARY = "AI coding agent for the terminal"
DESCRIPTION = "opencode is an AI coding agent that runs in the terminal. It works with a \
range of model providers, reads and edits files in a project, runs commands, \
and keeps a session history. \
 \
This build is the command line client only. The optional web interface is not \
included. \
 \
It also does not update itself, install npm packages into your home \
directory, or download syntax highlighting grammars from GitHub, all of which \
upstream does by default. README.SUSE-maint lists the environment variables \
that turn each of them back on."
LICENSE = "0BSD & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & BlueOak-1.0.0 & CC-BY-3.0 & CC-BY-4.0 & CC0-1.0 & ISC & MIT"

PV = "1.18.30"

RPM_NAME = "opencode-1.18.30-2.1.aarch64.rpm"
RPM_HASH = "15dca86fe81b1be277fc585f62ace29c938130e73150c8d7fa0721df4a43a023659b950099b13c2a466ccf94b98a470497dbac8e4d39abcb17c2a2d6db15c6f0"

RPROVIDES:${PN} += "opencode"

RDEPENDS:${PN} += "git-core \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libdeflate.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libspng.so.0 \
libturbojpeg.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libzstd.so.1 \
opentui \
ripgrep"

inherit rpm
