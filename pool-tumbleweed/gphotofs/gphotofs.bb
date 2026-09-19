SUMMARY = "User Level File System for gphoto-Based Cameras"
DESCRIPTION = "This package provides a fuse module to make digital cameras supported \
by libgphoto2 visible as a file system. \
 \
 \
 \
Authors: \
-------- \
    Scott Fritzinger <scottf@scs.unr.edu> \
    Lutz Müller <lutz@users.sourceforge.net> \
 \
    Eugene Crosser <crosser@average.org> \
    Matt Martin <matt.martin@ieee.org> \
    Gary Ross <gdr@hooked.net> \
    M. Adam Kendall <joker@penguinpub.com> \
    Del Simmons <del@gphoto.org> \
    Bob Paauwe <bpaauwe@bobsplace.com> \
    Cliff Wright <cliff@snipe444.org> \
    Phill Hugo <phill@gphoto.org> \
    Beat Christen <spiff@longstreet.ch> \
    Warren Baird <wjbaird@bigfoot.com> \
    Brent D. Metz <bmetz@vt.edu> \
    Brian Hirt <bhirt@loopy.berkhirt.com> \
    Mandrake <mandrake@lobotomy.com> \
    Randy D. Scott <scottr@wwa.com> \
    Paul S. Jenner <psj@mustec.eu.org> \
    Tuomas Kuosmanen <tigert@gimp.org> \
    Ole Aamot <oleaa@ifi.uio.no> \
    Mariusz Zynel <mariusz@mizar.org> \
    Johannes Erdfelt <johannes@erdfelt.com> \
    Werner Almesberger <almesber@lrc.di.epfl.ch> \
    Ole W. Saastad <o.w.saastad@kjemi.uio.no> \
    Veros Kaplan <xkaplan@informatics.muni.cz> \
    Wolfgang Reissnegger \
    Philippe Marzouk <philm@users.sourceforge.net> \
    Edouard Lafargue <lafargue@oslo.geco-prakla.slb.com> \
    Bart van Leeuwen <bart@netage.nl> \
    M. Adam Kendall <joker@penguinpub.com> \
    Mark Davies <mdavies@dial.pipex.com> \
    Beat Christen <spiff@longstreet.ch> \
    Gus Hartmann <hartmann@madison-expat.net> \
    Raymond Penners <raymond@dotsphinx.com> \
    Marcus Meissner <marcus@jet.franken.de> \
    Hans Ulrich Niedermann <hun@users.sourceforge.net> \
    Colin Marquardt <cmarqu@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "gphotofs-1.0-2.7.aarch64.rpm"
RPM_HASH = "db5e9a5b9099320b758836b8bd1ac5b0ea8498fd5c2f33d7eb3f6c097a73195ac92ea81a679900c61ae0a0a72cf3fc24b0ded50acb023d7fceafa3e0d39a7b3b"

RPROVIDES:${PN} += "gphotofs"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libglib-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6"

inherit rpm
