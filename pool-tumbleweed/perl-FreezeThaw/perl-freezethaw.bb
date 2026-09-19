SUMMARY = "Converting Perl structures to strings and back"
DESCRIPTION = "Converts data to/from stringified form, appropriate for saving-to/reading-from \
permanent storage. \
 \
Deals with objects, circular lists, repeated appearence of the same refence. \
Does not deal with overloaded stringify operator yet. \
 \
  Author:	Ilya Zakharevich"
LICENSE = "Artistic-1.0"

PV = "0.5001"

RPM_NAME = "perl-FreezeThaw-0.5001-19.46.aarch64.rpm"
RPM_HASH = "1dc2c5ef1274756fb6974536e7104cb60566bd6db939e3694efc4e80392b3e4f9a1fd3e92fb0196bdd3336547bab99e837e460948134c6e63d36505a78d4c480"

RPROVIDES:${PN} += "perl-FreezeThaw"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
