SUMMARY = "Trello backup script"
DESCRIPTION = "This tool backups everything from Trello: \
 \
 * boards, open and closed, as JSON files \
 * lists, open and archived, as JSON files \
 * cards, open and archived, as JSON files \
 * attachments, downloaded as raw files \
 \
The script also creates a folder tree structure corresponding to \
the way data is organized. This is to make it more convenient to \
navigate locally between folders, as it mimics the flow from \
the web and mobile apps."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "trello-full-backup-0.3.1-1.23.noarch.rpm"
RPM_HASH = "725027240165fccf5ee1b8b5c293ac38385f93b3ac95a4424ec7650c1cd9d2a9207ca20ffb123633a0c1bfa313bc6c715fe085d0b0e6c6b7d20e352656091aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trello-full-backup \
python3dist-trello-full-backup \
trello-full-backup"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-requests"

inherit rpm
