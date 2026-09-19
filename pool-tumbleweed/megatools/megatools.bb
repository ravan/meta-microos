SUMMARY = "CLI client for mega.nz"
DESCRIPTION = "Megatools allow you to copy individual files as well as entire directory trees \
to and from the cloud. You can also perform streaming downloads for example to \
preview videos and audio files, without needing to download the entire file. \
 \
You can register an account using a 'megareg' tool, with the benefit of having \
true control of your encryption keys. \
 \
Megatools are robust and optimized for fast operation - as fast as Mega servers \
allow. Memory requirements and CPU utilization are kept at minimum."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.4"

RPM_NAME = "megatools-1.11.4-1.6.aarch64.rpm"
RPM_HASH = "792f3d3b07a1a95d77b7185815d7adabb8c430e5b1d3b887718e0f13023d7b129b4fb950bb9d91ff76c8e7e4455285ae661252becfbed6ef83fad3ddaef706cd"

RPROVIDES:${PN} += "megatools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
