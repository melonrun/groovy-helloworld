package variable

def name = 'sample string'
println name.class

def newName = '''adf sample string '''
println newName.class

def dName = "dName"
println dName

def oName = "oreo name"
// ${} 可以扩展字符串
def helloName = "hello ${oName}"
println helloName.class