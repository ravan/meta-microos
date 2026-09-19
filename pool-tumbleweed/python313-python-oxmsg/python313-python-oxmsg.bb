SUMMARY = "Parse Outlook MSG (.msg) files to extract email messages and attachments"
DESCRIPTION = "The target use case is extracting Outlook message text and accessing attachments. \
There is no support for modifying messages or creating them from scratch. In \
addition to message text, other message properties such as sent-date, etc. are \
also accessible."
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "python313-python-oxmsg-0.0.2-1.7.noarch.rpm"
RPM_HASH = "df9ce294d1d43eea4e6ffac1fd25bb5ead7faee6147765db77ac4f749998a365eccb6fd9daf8378b176c43478e51e557edb20961d4b7ff6cfc72b3443e6c8c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-oxmsg \
python3.13dist-python-oxmsg \
python313-python-oxmsg \
python3dist-python-oxmsg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-olefile \
python313-typing-extensions \
update-alternatives"

inherit rpm
