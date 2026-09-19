SUMMARY = "Extra features for standard library's cmd module"
DESCRIPTION = "Enhancements for standard library's cmd module. \
 \
Drop-in replacement adds several features for command-prompt tools: \
 \
    * Searchable command history (commands: 'hi', 'li', 'run') \
    * Load commands from file, save to file, edit commands in file \
    * Multi-line commands \
    * Case-insensitive commands \
    * Special-character shortcut commands (beyond cmd's '@' and '!') \
    * Settable environment parameters \
    * Parsing commands with flags \
    * > (filename), >> (filename) redirect output to file \
    * < (filename) gets input from file \
    * bare >, >>, < redirect to/from paste buffer \
    * accepts abbreviated commands when unambiguous \
    * `py` enters interactive Python console \
    * test apps against sample session transcript (see example/example.py)"
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python313-cmd2-4.2.0-1.1.noarch.rpm"
RPM_HASH = "b6fe8c8f6883d922ce4f8828a5ed9eb848a62cc546e2440dea9aaf1cd767d67d570da4200e118b0f4635fc6454346a1df53f7a3d1825fe2f341e5b82ec595c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmd2 \
python3.13dist-cmd2 \
python313-cmd2 \
python3dist-cmd2"

RDEPENDS:${PN} += "python-abi \
python313 \
python313-prompt-toolkit \
python313-pyperclip \
python313-rich \
python313-rich-argparse"

inherit rpm
