SUMMARY = "The Eksblowfish block cipher"
DESCRIPTION = "An object of this type encapsulates a keyed instance of the Eksblowfish \
block cipher, ready to encrypt and decrypt. \
 \
Eksblowfish is a variant of the Blowfish cipher, modified to make the key \
setup very expensive. ('Eks' stands for 'expensive key schedule'.) This \
doesn't make it significantly cryptographically stronger, but is intended \
to hinder brute-force attacks. It also makes it unsuitable for any \
application requiring key agility. It was designed by Niels Provos and \
David Mazieres for password hashing in OpenBSD. See \
Crypt::Eksblowfish::Bcrypt for the hash algorithm. See \
Crypt::Eksblowfish::Blowfish for the unmodified Blowfish cipher. \
 \
Eksblowfish is a parameterised (family-keyed) cipher. It takes a cost \
parameter that controls how expensive the key scheduling is. It also takes \
a family key, known as the 'salt'. Cost and salt parameters together define \
a cipher family. Within each family, a key determines an encryption \
function in the usual way. See Crypt::Eksblowfish::Family for a way to \
encapsulate an Eksblowfish cipher family."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.9.0"

RPM_NAME = "perl-Crypt-Eksblowfish-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "0be30016e9af77b91d7c80a1ab25fed2d4672ae0d7123a4e81e56d6d044516e719d70364d09ab5e9866538e73e4304ea28c8400ec5e5002a13624e02850c80ed"

RPROVIDES:${PN} += "perl-Crypt--Eksblowfish \
perl-Crypt--Eksblowfish--Bcrypt \
perl-Crypt--Eksblowfish--Blowfish \
perl-Crypt--Eksblowfish--Family \
perl-Crypt--Eksblowfish--Subkeyed \
perl-Crypt--Eksblowfish--Uklblowfish \
perl-Crypt-Eksblowfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Mix \
perl-parent"

inherit rpm
