SUMMARY = "Parse Outlook MSG (.msg) files to extract email messages and attachments"
DESCRIPTION = "The target use case is extracting Outlook message text and accessing attachments. \
There is no support for modifying messages or creating them from scratch. In \
addition to message text, other message properties such as sent-date, etc. are \
also accessible."
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "python314-python-oxmsg-0.0.2-1.7.noarch.rpm"
RPM_HASH = "8d8f2111b17f00d3d32a16569a0a91718dbd1c27fb7185cadb507404e2a510ff1f2ab8153c3daff3f872840f7af588e9d275ceebd87ca8e68298e5aed3eef95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-oxmsg \
python314-python-oxmsg \
python3dist-python-oxmsg"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-olefile \
python314-typing-extensions \
update-alternatives"

inherit rpm
