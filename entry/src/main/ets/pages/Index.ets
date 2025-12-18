@Entry
@Component
struct Index {
  @State message: string = '我的鸿蒙库测试'

  build() {
    Row() {
      Column() {
        // 显示一行大字
        Text(this.message)
          .fontSize(30)
          .fontWeight(FontWeight.Bold)
          .margin({ bottom: 20 })

        // 显示提示信息
        Text("如果你看到这个界面\n说明 App 没有闪退！")
          .fontSize(18)
          .textAlign(TextAlign.Center)
          .fontColor(Color.Gray)
      }
      .width('100%')
    }
    .height('100%')
  }
}