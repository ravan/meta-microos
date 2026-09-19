SUMMARY = "Password Manager"
DESCRIPTION = "KeePass is a password manager, which helps you to manage your \
passwords. You can put all your passwords in one database, which is \
locked with one master key or a key file, so that you only have to \
remember one single master password or select the key file to unlock \
the whole database. The databases are encrypted using AES and \
Twofish."
LICENSE = "GPL-2.0-or-later"

PV = "2.61.1"

RPM_NAME = "keepass-2.61.1-1.2.noarch.rpm"
RPM_HASH = "06ecfeefae6ecf0425a3d6f63f5fd1e6646861fbff8929bc32374e2f2ed7f06f4a365157b4319da6630ed64fca29a6401a221f402b3fdc9ea5fe02a02c0b0023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepass \
mono-KeePass \
mono-KeePassLib"

RDEPENDS:${PN} += "mono-System \
mono-System.Core \
mono-System.Drawing \
mono-System.Security \
mono-System.Windows.Forms \
mono-System.Xml \
mono-mscorlib"

inherit rpm
