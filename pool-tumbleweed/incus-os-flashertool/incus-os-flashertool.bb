SUMMARY = "CLI tool to download and customize a IncusOS installation image"
DESCRIPTION = "The flasher tool is provided for more advanced users who need to perform more \
customizations of the install seed than the web-based customizer supports. \
 \
When run, you will first be prompted for the image format you want to use, \
either ISO (default) or raw disk image. Note that the ISO isn’t a hybrid image; \
if you want to boot from a USB stick you should choose the raw disk image \
format. \
 \
The flasher tool will then connect to the Linux Containers CDN and download the \
latest release. \
 \
Once downloaded, you will be presented with an interactive menu you can use to \
customize the install options."
LICENSE = "Apache-2.0"

PV = "202601100100"

RPM_NAME = "incus-os-flashertool-202601100100-1.5.aarch64.rpm"
RPM_HASH = "f49d1607d42b0705db1e3e55d667ef6949043c3dee598d197dd57c4526b8656dfd094c83c79ed68be2a25a348e0175917101bac92a5c07f4c7a2328a8de5ce2a"

RPROVIDES:${PN} += "incus-os-flashertool"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
