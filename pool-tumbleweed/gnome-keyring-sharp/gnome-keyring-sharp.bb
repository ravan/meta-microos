SUMMARY = "Managed Implementation of libgnome-keyring"
DESCRIPTION = "When the gnome-keyring-daemon is running, you can use this to \
retrieve/store confidential information such as passwords, notes or \
network services user information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "gnome-keyring-sharp-1.0.2-27.4.aarch64.rpm"
RPM_HASH = "465b1ff142359eef7a1c4388bdfc1a4eef406a93742c5fd2cbfc27c8a24835c51867a16b21bbb9d717650bc6bafe189911c2d128b39d91592375e3e895842272"

RPROVIDES:${PN} += "gnome-keyring-sharp \
libgnome-keyring-sharp-glue.so \
mono-Gnome.Keyring"

RDEPENDS:${PN} += "gnome-keyring \
libgnome-keyring.so.0 \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
